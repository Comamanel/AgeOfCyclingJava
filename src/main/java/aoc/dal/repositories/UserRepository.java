package aoc.dal.repositories;

import aoc.dal.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> getByUsername(String username);
}
