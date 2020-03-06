package aoc.bll.services.cyclistservices;

import aoc.dal.models.Cyclist;
import aoc.dal.repositories.CyclistRepository;
import aoc.dal.repositories.UserRepository;
import aoc.front.dto.CyclistForm;
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
    private UserRepository userRepository;

    @Autowired
    public CyclistServiceImpl(CyclistRepository cyclistRepository, UserRepository userRepository) {
        this.cyclistRepository = cyclistRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<Cyclist> findById(Long id) {
        return this.cyclistRepository.findById(id);
    }

    @Override
    public Optional<Cyclist> findByLastName(String lastName) {
        throw new NotImplementedException();
    }

    @Override
    public List<Cyclist> findAllByUserId(Long userId) {
        return this.cyclistRepository.findAllByUserId(userId);
    }

    @Override
    public List<Cyclist> findAllByUserUsername(String username) {
        return this.cyclistRepository.findAllByUserUsername(username);
    }

    @Override
    public List<Cyclist> findAll() {
        return (List<Cyclist>) this.cyclistRepository.findAll();
    }

    @Override
    public Cyclist save(Cyclist cyclist) {
        return this.cyclistRepository.save(cyclist);
    }

    @Override
    public Cyclist update(Long id, Cyclist cyclist) {
        cyclist.setId(id);
        return this.cyclistRepository.save(cyclist);
    }

    @Override
    public void remove(Cyclist cyclist) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Cyclist save(CyclistForm cyclistRegister) throws Exception {
        userRepository.getByUsername(cyclistRegister.getUser());
        /*Cyclist cyclist = new Cyclist(cyclistRegister,
                        userRepository.getByUsername(cyclistRegister.getUser()).orElseThrow(Exception::new));*/
        return cyclistRepository.save(new Cyclist(cyclistRegister, userRepository.getByUsername(cyclistRegister.getUser()).orElseThrow(Exception::new)));
    }
}
