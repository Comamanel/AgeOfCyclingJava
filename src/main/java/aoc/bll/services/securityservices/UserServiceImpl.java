package aoc.bll.services.securityservices;

import aoc.dal.models.User;
import aoc.dal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public Optional<?> login(aoc.bll.models.User user) {
        throw new NotImplementedException();
    }

    @Override
    public List<aoc.bll.models.User> getAll() {
        throw new NotImplementedException();
    }

    @Override
    public Optional<aoc.bll.models.User> getById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<aoc.bll.models.User> getByUsername(String username) {
        return this.userRepository.getByUsername(username).map(aoc.bll.models.User::from);
    }


    @Override
    public aoc.bll.models.User register(aoc.bll.models.User user) {
        return aoc.bll.models.User.from(this.userRepository.save(User.from(user)));
    }

    @Override
    public boolean delete(aoc.bll.models.User user) {
        throw new NotImplementedException();
    }

    @Override
    public boolean deleteByUsername(String username) {
        throw new NotImplementedException();
    }

    @Override
    public boolean deleteByEmail(String email) {
        throw new NotImplementedException();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return aoc.bll.models.User.from(userRepository.getByUsername(s).orElse(new User()));
    }
}
