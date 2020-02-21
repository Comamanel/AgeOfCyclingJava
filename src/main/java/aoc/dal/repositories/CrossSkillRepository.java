package aoc.dal.repositories;

import aoc.dal.models.CrossSkill;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CrossSkillRepository extends CrudRepository<CrossSkill, Integer> {
    Optional<CrossSkill> findByLabel(String label);
}
