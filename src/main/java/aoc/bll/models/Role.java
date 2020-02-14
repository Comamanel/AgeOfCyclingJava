package aoc.bll.models;

import aoc.dal.models.RoleDAO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;


@Getter
@Setter
public class Role implements GrantedAuthority {
    private Long id;
    private String label;

    @Override
    public String getAuthority() {
        return label;
    }

    public static Role from(RoleDAO roleDAO) {
        Role role = new Role();

        if (roleDAO != null) {
            role.setId(roleDAO.getId());
            role.setLabel(roleDAO.getLabel());
        }

        return role;
    }
}
