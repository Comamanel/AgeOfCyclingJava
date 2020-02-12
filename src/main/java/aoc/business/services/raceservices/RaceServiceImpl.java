package aoc.business.services.raceservices;

import aoc.business.models.Race;
import aoc.dal.repositories.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RaceServiceImpl implements RaceService {
    private RaceRepository raceRepository;

    @Autowired
    public RaceServiceImpl(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public Optional<Race> findById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<Race> findByName(String name) {
        throw new NotImplementedException();
    }

    @Override
    public List<Race> findAll() {
        List<Race> races = new ArrayList<>();

        this.raceRepository.findAll().forEach(r -> races.add(Race.from(r)));
        return races;
    }

    @Override
    public Race save(Race race) {
        throw new NotImplementedException();
    }

    @Override
    public Race update(Long id, Race race) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Race race) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {
        throw new NotImplementedException();
    }
}
