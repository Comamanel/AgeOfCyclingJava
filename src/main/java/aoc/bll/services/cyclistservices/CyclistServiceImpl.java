package aoc.bll.services.cyclistservices;

import aoc.bll.models.User;
import aoc.dal.models.Cyclist;
import aoc.dal.repositories.CyclistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CyclistServiceImpl implements CyclistService {
    private CyclistRepository cyclistRepository;

    @Autowired
    public CyclistServiceImpl(CyclistRepository cyclistRepository) {
        this.cyclistRepository = cyclistRepository;
    }

    @Override
    public Optional<aoc.bll.models.Cyclist> findById(Long id) {
        return this.cyclistRepository.findById(id).map(aoc.bll.models.Cyclist::from);
    }

    @Override
    public Optional<aoc.bll.models.Cyclist> findByLastName(String lastName) {
        throw new NotImplementedException();
    }

    @Override
    public List<aoc.bll.models.Cyclist> findAllByUserId(Long userId) {
        return this.cyclistRepository.findAllByUserId(userId)
                .stream()
                .map(aoc.bll.models.Cyclist::from)
                .collect(Collectors.toList());
    }

    @Override
    public List<aoc.bll.models.Cyclist> findAllByUserUsername(String username) {
        return this.cyclistRepository.findAllByUserUsername(username)
                .stream()
                .map(aoc.bll.models.Cyclist::from)
                .collect(Collectors.toList());
    }

    @Override
    public List<aoc.bll.models.Cyclist> findAll() {
        List<aoc.bll.models.Cyclist> cyclists = new ArrayList<>();
        this.cyclistRepository.findAll().forEach(c -> cyclists.add(aoc.bll.models.Cyclist.from(c)));

        return cyclists;
    }

    @Override
    public aoc.bll.models.Cyclist save(aoc.bll.models.Cyclist cyclist) {
        return aoc.bll.models.Cyclist.from(this.cyclistRepository.save(Cyclist.from(cyclist)));
    }

    @Override
    public aoc.bll.models.Cyclist update(Long id, aoc.bll.models.Cyclist cyclist) {
        cyclist.setId(id);
        return aoc.bll.models.Cyclist.from(this.cyclistRepository.save(Cyclist.from(cyclist)));
    }

    @Override
    public void remove(aoc.bll.models.Cyclist cyclist) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {

    }
}
