package aoc.business.services.skillservices;

import aoc.business.models.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SkillService {
    Optional<Skill> findById(Long id);
    Optional<Skill> findByLabel(String label);
    List<Skill> findAll();
    Skill save(Skill skill);
    Skill update(Long id, Skill skill);
    void remove(Skill skill);
    void remove(Long id);
}
