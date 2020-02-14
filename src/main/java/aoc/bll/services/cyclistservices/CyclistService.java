package aoc.bll.services.cyclistservices;

import aoc.bll.models.Cyclist;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CyclistService {
    Optional<Cyclist> findById(Long id);
    Optional<Cyclist> findByLastName(String lastName);
    List<Cyclist> findAll();
    Cyclist save(Cyclist cyclist);
    Cyclist update(Long id, Cyclist cyclist);
    void remove(Cyclist cyclist);
    void remove(Long id);
}
