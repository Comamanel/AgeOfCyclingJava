package aoc.bll.services.securityservices;

import aoc.dal.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

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
