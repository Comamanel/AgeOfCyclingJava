package aoc;

import aoc.dal.models.Cyclist;
import aoc.dal.models.Role;
import aoc.dal.models.User;
import aoc.dal.repositories.CyclistRepository;
import aoc.dal.repositories.RoleRepository;
import aoc.dal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AoCApplication {
    public static void main(String[] args) {
        SpringApplication.run(AoCApplication.class, args);


    }

    @EventListener(ApplicationReadyEvent.class)
    private void adds(){
        addUser();
        addCyclist();
    }

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private CyclistRepository cyclistRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private void addUser(){
        Role role = this.roleRepository.findByLabel("ROLE_ADMIN").orElse(null);

        User user = new User();
        user.setEmail("florent.piette9@gmail.com");
        user.setUsername("fpiette");
        user.setPassword(passwordEncoder.encode("Test1234="));
        user.setRole(role);


        User u = userRepository.save(user);
        Cyclist c = cyclistRepository.findById(1L).orElse(null);
        if(c != null) {
            c.setUser(u);
            c = cyclistRepository.save(c);

        }

    }

    private void addCyclist(){
        User u = this.userRepository.getByUsername("fpiette").orElse(null);
        Cyclist cyclist = this.cyclistRepository.findByLastName("Piette").orElse(null);
        if(cyclist != null) {
            cyclist.setUser(u);
            this.cyclistRepository.save(cyclist);
        }
        Cyclist cyclist2 = this.cyclistRepository.findByLastName("Stripe").orElse(null);
        if(cyclist2 != null) {
            cyclist2.setUser(u);
            this.cyclistRepository.save(cyclist2);
        }
    }
}
