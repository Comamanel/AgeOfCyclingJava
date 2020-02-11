package aoc.dal.repositories;

import aoc.dal.models.CyclistDAO;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CyclistRepository extends CrudRepository<CyclistDAO, Long> {
    Optional<CyclistDAO> findByLastName(String lastName);
}
