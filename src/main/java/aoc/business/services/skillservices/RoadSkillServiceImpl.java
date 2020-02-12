package aoc.business.services.skillservices;

import aoc.business.models.RoadSkill;
import aoc.dal.models.RoadSkillDAO;
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
    public Optional<RoadSkill> findById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<RoadSkill> findByLabel(String label) {
        throw new NotImplementedException();
    }

    @Override
    public List<RoadSkill> findAll() {
        throw new NotImplementedException();
    }

    @Override
    public RoadSkill save(RoadSkill skill) {
        return RoadSkill.from(this.roadSkillRepository.save(RoadSkillDAO.from(skill)));
    }

    @Override
    public RoadSkill update(Long id, RoadSkill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(RoadSkill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {
        throw new NotImplementedException();
    }
}
