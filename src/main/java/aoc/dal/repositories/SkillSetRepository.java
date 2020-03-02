package aoc.dal.repositories;

import aoc.dal.models.Skill;
import aoc.dal.models.SkillSet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillSetRepository extends CrudRepository<SkillSet, Skill> {
}
