package aoc.business.models;

import aoc.dal.models.RoleDAO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private long id;
    private String username;
    private String password;
    private String email;

    @JoinColumn(name="role_id")
    @ManyToOne(targetEntity = RoleDAO.class)
    private RoleDAO role;
}
