package aoc.bll.services.skillservices;

import aoc.dal.models.CrossSkill;
import aoc.dal.repositories.CrossSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;

@Service
public class CrossSkillServiceImpl implements CrossSkillService {
    private CrossSkillRepository crossSkillRepository;

    @Autowired
    public CrossSkillServiceImpl(CrossSkillRepository crossSkillRepository) {
        this.crossSkillRepository = crossSkillRepository;
    }

    @Override
    public Optional<CrossSkill> findById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<CrossSkill> findByLabel(String label) {
        throw new NotImplementedException();
    }

    @Override
    public List<CrossSkill> findAll() {
        throw new NotImplementedException();
    }

    @Override
    public CrossSkill save(CrossSkill skill) {
        return this.crossSkillRepository.save(skill);
    }

    @Override
    public CrossSkill update(Long id, CrossSkill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(CrossSkill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {
        throw new NotImplementedException();
    }
}
