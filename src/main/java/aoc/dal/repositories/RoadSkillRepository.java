package aoc.dal.repositories;

import aoc.dal.models.RoadSkill;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoadSkillRepository extends CrudRepository<RoadSkill, Integer> {
    Optional<RoadSkill> findByLabel(String label);
}
