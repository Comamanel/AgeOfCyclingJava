package aoc.dal.models;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "role_users")
public class Role implements Serializable, GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long id;

    @Column(nullable = false, unique = true)
    private String label;

    @OneToMany(targetEntity = User.class, mappedBy = "role")
    private List<User> users;


    @Override
    public String getAuthority() {
        return label;
    }
}
