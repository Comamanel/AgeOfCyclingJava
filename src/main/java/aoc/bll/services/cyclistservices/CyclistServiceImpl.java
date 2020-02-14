package aoc.bll.services.cyclistservices;

import aoc.bll.models.Cyclist;
import aoc.dal.repositories.CyclistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CyclistServiceImpl implements CyclistService {
    private CyclistRepository cyclistRepository;

    @Autowired
    public CyclistServiceImpl(CyclistRepository cyclistRepository) {
        this.cyclistRepository = cyclistRepository;
    }

    @Override
    public Optional<Cyclist> findById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<Cyclist> findByLastName(String lastName) {
        throw new NotImplementedException();
    }

    @Override
    public List<Cyclist> findAll() {
        List<Cyclist> cyclists = new ArrayList<>();
        this.cyclistRepository.findAll().forEach(c -> cyclists.add(Cyclist.from(c)));

        return cyclists;
    }

    @Override
    public Cyclist save(Cyclist cyclist) {
        throw new NotImplementedException();
    }

    @Override
    public Cyclist update(Long id, Cyclist cyclist) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Cyclist cyclist) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {

    }
}
