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
    public Optional<?> login(User user) {
        throw new NotImplementedException();
    }

    @Override
    public List<User> getAll() {
        throw new NotImplementedException();
    }

    @Override
    public Optional<User> getById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return this.userRepository.getByUsername(username).map(User::from);
    }


    @Override
    public User register(User user) {
        return this.userRepository.save(user)));
    }

    @Override
    public boolean delete(User user) {
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
        return (UserDetails) userRepository.getByUsername(s).orElseThrow(new UsernameNotFoundException("Username " + s + " not found.")));
    }
}
