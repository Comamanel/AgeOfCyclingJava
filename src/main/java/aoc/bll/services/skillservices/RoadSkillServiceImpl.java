package aoc.bll.services.skillservices;

import aoc.dal.models.RoadSkill;
import aoc.dal.repositories.RoadSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;

@Service
public class RoadSkillServiceImpl implements RoadSkillService {
    private RoadSkillRepository roadSkillRepository;

    @Autowired
    public RoadSkillServiceImpl(RoadSkillRepository roadSkillRepository) {
        this.roadSkillRepository = roadSkillRepository;
    }

    @Override
    public Optional<aoc.bll.models.RoadSkill> findById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<aoc.bll.models.RoadSkill> findByLabel(String label) {
        throw new NotImplementedException();
    }

    @Override
    public List<aoc.bll.models.RoadSkill> findAll() {
        throw new NotImplementedException();
    }

    @Override
    public aoc.bll.models.RoadSkill save(aoc.bll.models.RoadSkill skill) {
        return aoc.bll.models.RoadSkill.from(this.roadSkillRepository.save(RoadSkill.from(skill)));
    }

    @Override
    public aoc.bll.models.RoadSkill update(Long id, aoc.bll.models.RoadSkill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(aoc.bll.models.RoadSkill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {
        throw new NotImplementedException();
    }
}
