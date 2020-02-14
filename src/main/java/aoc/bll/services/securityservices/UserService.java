package aoc.bll.services.securityservices;

import aoc.bll.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService extends UserDetailsService {
    Optional<?> login(User user);
    List<User> getAll();
    Optional<User> getById(Long id);
    Optional<User> getByUsername(String username);
    boolean register(User user);
    boolean delete(User user);
    boolean deleteByUsername(String username);
    boolean deleteByEmail(String email);
}
