package aoc.bll.models;

import aoc.dal.models.Role;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(of={ "id", "username", "email" })
public class User implements UserDetails {
    private long id;
    private String username;
    private String password;
    private String email;

    @JoinColumn(name="role_id")
    @ManyToOne(targetEntity = Role.class)
    private aoc.bll.models.Role role;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<aoc.bll.models.Role> roles = new ArrayList<>();
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

    public static User from(aoc.dal.models.User userDAO){
        User user = new User();
        user.setUsername(userDAO.getUsername());
        user.setPassword(userDAO.getPassword());
        user.setEmail(userDAO.getEmail());
        user.setId(userDAO.getId());
        user.setRole(aoc.bll.models.Role.from(userDAO.getRole()));

        return user;
    }
}
