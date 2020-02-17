package aoc.dal.repositories;

import aoc.dal.models.Cyclist;
import aoc.dal.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CyclistRepository extends CrudRepository<Cyclist, Long> {
    Optional<Cyclist> findByLastName(String lastName);
    List<Cyclist> findAllByUserId(Long userId);
    List<Cyclist> findAllByUserUsername(String username);
}
