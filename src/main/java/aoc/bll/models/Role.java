package aoc.bll.models;

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

    public static Role from(aoc.dal.models.Role r) {
        Role role = new Role();

        if (r != null) {
            role.setId(r.getId());
            role.setLabel(r.getLabel());
        }

        return role;
    }
}
