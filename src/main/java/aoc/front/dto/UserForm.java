package aoc.front.dto;

import aoc.business.models.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
public class UserForm {
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;

    public static UserForm from(User user){
        UserForm uf = new UserForm();

        uf.setEmail(user.getEmail());
        uf.setUsername(user.getUsername());
        uf.setPassword(user.getPassword());

        return uf;
    }
}
