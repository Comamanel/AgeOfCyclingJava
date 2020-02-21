package aoc.bll.services.skillservices;

import aoc.dal.models.SkillSet;
import org.springframework.stereotype.Service;

@Service
public interface SkillSetService {
    SkillSet save(SkillSet skillSet);
}
