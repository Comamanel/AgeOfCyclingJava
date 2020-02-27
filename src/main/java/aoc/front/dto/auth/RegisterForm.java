package aoc.front.dto.auth;

import aoc.dal.models.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
public class RegisterForm {
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;

    public RegisterForm(User user){
        this.setEmail(user.getEmail());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
    }
}
