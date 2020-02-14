package aoc.bll.services.raceservices;

import aoc.bll.models.Race;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RaceService {
    Optional<Race> findById(Long id);
    Optional<Race> findByName(String name);
    List<Race> findAll();
    Race save(Race race);
    Race update(Long id, Race race);
    void remove(Race race);
    void remove(Long id);
}
