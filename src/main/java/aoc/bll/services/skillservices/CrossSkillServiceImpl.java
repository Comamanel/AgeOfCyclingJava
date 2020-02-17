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
    public Optional<aoc.bll.models.CrossSkill> findById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<aoc.bll.models.CrossSkill> findByLabel(String label) {
        throw new NotImplementedException();
    }

    @Override
    public List<aoc.bll.models.CrossSkill> findAll() {
        throw new NotImplementedException();
    }

    @Override
    public aoc.bll.models.CrossSkill save(aoc.bll.models.CrossSkill skill) {
        return aoc.bll.models.CrossSkill.from(this.crossSkillRepository.save(CrossSkill.from(skill)));
    }

    @Override
    public aoc.bll.models.CrossSkill update(Long id, aoc.bll.models.CrossSkill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(aoc.bll.models.CrossSkill skill) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {
        throw new NotImplementedException();
    }
}
