package aoc.dal.models;

import aoc.business.models.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name="aoc_user")
public class UserDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;

    @JoinColumn(name="role_id")
    @ManyToOne(targetEntity = RoleDAO.class)
    private RoleDAO role;


    public static UserDAO from(User user){
        UserDAO u = new UserDAO();
        u.setUsername(user.getUsername());
        u.setPassword(user.getPassword());
        u.setEmail(user.getEmail());
        u.setId(user.getId());

        return u;
    }
}
