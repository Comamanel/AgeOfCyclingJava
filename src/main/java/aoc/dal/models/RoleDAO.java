package aoc.dal.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "role_users")
public class RoleDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long id;

    @Column(nullable = false)
    private String label;

    @OneToMany(targetEntity = UserDAO.class, mappedBy = "role")
    private List<UserDAO> users;
}
