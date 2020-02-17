package aoc.dal.repositories;

import aoc.dal.models.Race;
import org.springframework.data.repository.CrudRepository;

public interface RaceRepository extends CrudRepository<Race, Long> {
}
