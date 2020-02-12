package aoc.business.services.securityservices;

import aoc.business.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Optional<?> login(User user);
    List<User> getAll();
    Optional<User> getById(Long id);
    Optional<User> getByUsername(String username);
    boolean register(User user);
    boolean delete(User user);
    boolean deleteByUsername(String username);
    boolean deleteByEmail(String email);
}
