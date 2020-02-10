package aoc.dal.repositories;

import aoc.dal.models.Cyclist;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CyclistRepository extends CrudRepository<Cyclist, Long> {
    Optional<Cyclist> findByLastName(String lastName);
}
