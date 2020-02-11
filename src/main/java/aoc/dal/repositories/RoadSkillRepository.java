package aoc.dal.repositories;

import aoc.dal.models.RoadSkillDAO;
import org.springframework.data.repository.CrudRepository;

public interface RoadSkillRepository extends CrudRepository<RoadSkillDAO, Integer> {
}
