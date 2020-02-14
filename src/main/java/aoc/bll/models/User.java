package aoc.bll.models;

import aoc.dal.models.RoleDAO;
import aoc.dal.models.UserDAO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class User implements UserDetails {
    private long id;
    private String username;
    private String password;
    private String email;

    @JoinColumn(name="role_id")
    @ManyToOne(targetEntity = RoleDAO.class)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<Role> roles = new ArrayList<>();
        roles.add(this.role);
        return roles;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public static User from(UserDAO userDAO){
        User user = new User();
        user.setUsername(userDAO.getUsername());
        user.setPassword(userDAO.getPassword());
        user.setEmail(userDAO.getEmail());
        user.setId(userDAO.getId());
        user.setRole(Role.from(userDAO.getRole()));

        return user;
    }
}
