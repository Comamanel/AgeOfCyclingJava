package aoc.bll.services.skillservices;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrossSkillService {
    Optional<CrossSkill> findById(Long id);
    Optional<CrossSkill> findByLabel(String label);
    List<CrossSkill> findAll();
    CrossSkill save(CrossSkill skill);
    CrossSkill update(Long id, CrossSkill skill);
    void remove(CrossSkill skill);
    void remove(Long id);
}
