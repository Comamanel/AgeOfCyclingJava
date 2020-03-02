package aoc.bll.services.skillservices;

import aoc.dal.models.Skill;
import aoc.dal.repositories.CrossSkillRepository;
import aoc.dal.repositories.RoadSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SkillServiceImpl implements SkillService {
    private RoadSkillRepository roadSkillRepository;
    private CrossSkillRepository crossSkillRepository;

    @Autowired
    public SkillServiceImpl(RoadSkillRepository roadSkillRepository, CrossSkillRepository crossSkillRepository) {
        this.roadSkillRepository = roadSkillRepository;
        this.crossSkillRepository = crossSkillRepository;
    }


    @Override
    public Optional<Skill> findById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<? extends aoc.dal.models.Skill> findByLabel(String label) {
        Optional<aoc.dal.models.RoadSkill> roadSkill = roadSkillRepository.findByLabel(label);
        if (!roadSkill.isPresent())
            return crossSkillRepository.findByLabel(label);
        else
            return roadSkill;
    }

    @Override
    public List<Skill> findAll() {
        List<Skill> skills = new ArrayList<>();
        this.crossSkillRepository.findAll().forEach(skills::add);
        this.roadSkillRepository.findAll().forEach(skills::add);
        return skills;
    }

    @Override
    public Skill save(Skill skill) {
        throw new NotImplementedException();
    }

    @Override
    public Skill update(Long id, Skill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Skill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {
        throw new NotImplementedException();
    }
}
