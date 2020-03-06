package aoc.front.controllers;

import aoc.bll.services.securityservices.RoleService;
import aoc.bll.services.securityservices.UserService;
import aoc.config.JwtTokenProvider;
import aoc.dal.models.Role;
import aoc.dal.models.User;
import aoc.front.dto.UserList;
import aoc.front.dto.auth.LoginForm;
import aoc.front.dto.auth.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/security")
public class AuthController {
    private UserService userService;
    private RoleService roleService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    public AuthController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostMapping(value="/register")
    public ResponseEntity<User> register(@RequestBody RegisterForm registerForm){

        User u = new User();
        u.setEmail(registerForm.getEmail());
        u.setPassword(passwordEncoder.encode(registerForm.getPassword()));
        u.setUsername(registerForm.getUsername());

        Role role = this.roleService.findByLabel("ROLE_MEMBER");
        u.setRole(role);
        return ResponseEntity.ok(this.userService.register(u));
    }

    @PostMapping(value="/login")
    public ResponseEntity<Map<Object, Object>> login(@RequestBody LoginForm loginForm){
        try{
            String login = loginForm.getUsername();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login, loginForm.getPassword()));

            List<String> roles = Collections.singletonList(this.userService.getByUsername(login)
                    .orElseThrow(() -> new UsernameNotFoundException("Username " + login + " not found"))
                    .getRole().getAuthority());
            String token = jwtTokenProvider.createToken(login, roles);
            Map<Object, Object> model = new HashMap<>();
            model.put("username", login);
            model.put("token", token);
            return ResponseEntity.ok(model);
        }
        catch (AuthenticationException e){
            throw new BadCredentialsException("Invalid username/password supplied");
        }
    }

    @PostMapping(value="/refresh")
    public ResponseEntity<UserList> refresh(@RequestBody String username){
        UserList user = new UserList();
        if(username != null){
            user = new UserList(this.userService.getByUsername(username).orElse(new User()));
        }
        return ResponseEntity.ok(user);
    }
}
