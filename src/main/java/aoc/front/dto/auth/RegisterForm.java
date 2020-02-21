package aoc.front.dto.auth;

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

    public static RegisterForm from(User user){
        RegisterForm uf = new RegisterForm();

        uf.setEmail(user.getEmail());
        uf.setUsername(user.getUsername());
        uf.setPassword(user.getPassword());

        return uf;
    }
}
