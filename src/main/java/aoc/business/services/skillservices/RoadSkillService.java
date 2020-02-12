package aoc.business.services.skillservices;

import aoc.business.models.RoadSkill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoadSkillService {
    Optional<RoadSkill> findById(Long id);
    Optional<RoadSkill> findByLabel(String label);
    List<RoadSkill> findAll();
    RoadSkill save(RoadSkill skill);
    RoadSkill update(Long id, RoadSkill skill);
    void remove(RoadSkill skill);
    void remove(Long id);
}
