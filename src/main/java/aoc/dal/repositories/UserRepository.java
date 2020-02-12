package aoc.dal.repositories;

import aoc.dal.models.UserDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserDAO, Long> {
    Optional<UserDAO> getByUsername(String username);
}
