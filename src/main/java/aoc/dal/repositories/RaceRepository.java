package aoc.dal.repositories;

import aoc.dal.models.RaceDAO;
import org.springframework.data.repository.CrudRepository;

public interface RaceRepository extends CrudRepository<RaceDAO, Long> {
}
