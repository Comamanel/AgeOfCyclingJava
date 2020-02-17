package aoc.bll.services.securityservices;

import aoc.bll.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoleService {
    Role findById(Long id);
    Role findByLabel(String label);
    List<Role> findAll();
    Role save(Role race);
    Role update(Long id, Role race);
    void remove(Role race);
    void remove(Long id);
}
