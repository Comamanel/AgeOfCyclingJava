package aoc.front.controllers;

import aoc.business.models.User;
import aoc.business.services.securityservices.UserService;
import aoc.front.dto.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/security")
public class SecurityController {
    private UserService userService;

    @Autowired
    public SecurityController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value="/register")
    public ResponseEntity<Boolean> register(@RequestBody UserForm userForm){

        //TODO: mettre le rôle à 0
        User u = new User();
        u.setEmail(userForm.getEmail());
        u.setPassword(userForm.getPassword());
        u.setUsername(userForm.getUsername());

        return ResponseEntity.ok(this.userService.register(u));
    }
}
