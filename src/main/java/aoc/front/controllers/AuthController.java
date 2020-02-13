package aoc.front.controllers;

import aoc.business.models.User;
import aoc.business.services.securityservices.UserService;
import aoc.front.dto.auth.LoginForm;
import aoc.front.dto.auth.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/security")
public class AuthController {
    private UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value="/register")
    public ResponseEntity<Boolean> register(@RequestBody RegisterForm registerForm){

        //TODO: mettre le rôle à 0
        User u = new User();
        u.setEmail(registerForm.getEmail());
        u.setPassword(registerForm.getPassword());
        u.setUsername(registerForm.getUsername());

        return ResponseEntity.ok(this.userService.register(u));
    }

    @PostMapping(value="/login")
    public ResponseEntity login(@RequestBody LoginForm loginForm){
        try{
            String login = loginForm.getUsername();
            authenticationMana
        }
        catch (AuthenticationException e){
            throw new BadCredentialsException("Invalid username/password supplied");
        }
    }
}
