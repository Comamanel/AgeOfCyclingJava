package aoc.front.controllers;

import aoc.bll.models.User;
import aoc.bll.services.securityservices.UserService;
import aoc.config.JwtTokenProvider;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping(value = "/api/security")
public class AuthController {
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value="/register")
    public ResponseEntity<Boolean> register(@RequestBody RegisterForm registerForm){

        //TODO: mettre le rôle à 0
        User u = new User();
        u.setEmail(registerForm.getEmail());
        u.setPassword(passwordEncoder.encode(registerForm.getPassword()));
        u.setUsername(registerForm.getUsername());

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
}
