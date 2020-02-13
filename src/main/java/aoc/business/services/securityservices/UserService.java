package aoc.business.services.securityservices;

import aoc.business.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService extends UserDetailsService {
    Optional<?> login(User user);
    List<User> getAll();
    Optional<User> getById(Long id);
    boolean register(User user);
    boolean delete(User user);
    boolean deleteByUsername(String username);
    boolean deleteByEmail(String email);
}
