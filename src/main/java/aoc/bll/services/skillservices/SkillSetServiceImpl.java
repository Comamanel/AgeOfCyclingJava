package aoc.bll.services.skillservices;

import aoc.dal.models.SkillSet;
import aoc.dal.repositories.SkillSetRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillSetServiceImpl implements SkillSetService{
    private SkillSetRepository skillSetRepository;

    @Autowired
    public SkillSetServiceImpl(SkillSetRepository skillSetRepository) {
        this.skillSetRepository = skillSetRepository;
    }

    @Override
    public SkillSet save(SkillSet skillSet) {
        return skillSetRepository.save(skillSet);
    }
}
