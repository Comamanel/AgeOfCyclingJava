package aoc.dal.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of={ "id", "username", "email" })
@ToString
@Table(name="aoc_user")
public class User implements Serializable {
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
    @ManyToOne(targetEntity = Role.class)
    private Role role;

    @OneToMany(targetEntity = Cyclist.class, mappedBy = "user")
    private List<Cyclist> cyclists;

    public User() {
        this.cyclists = new ArrayList<>();
    }

    public static User from(aoc.bll.models.User user){
        User u = new User();
        u.setUsername(user.getUsername());
        u.setPassword(user.getPassword());
        u.setEmail(user.getEmail());
        u.setId(user.getId());
        u.setRole(Role.from(user.getRole()));

        return u;
    }
}
