package aoc.business.services.securityservices;

import aoc.business.models.User;
import aoc.dal.models.UserDAO;
import aoc.dal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
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
    public boolean register(User user) {
        return this.userRepository.save(UserDAO.from(user)).getUsername() != null;
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
        return userRepository.getByUsername(s).orElse(null);
    }
}
