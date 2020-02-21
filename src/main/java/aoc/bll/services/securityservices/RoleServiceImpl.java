package aoc.bll.services.securityservices;

import aoc.dal.models.Role;
import aoc.dal.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findById(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public Role findByLabel(String label) {
        return this.roleRepository.findByLabel(label).orElse(null);
    }

    @Override
    public List<Role> findAll() {
        throw new NotImplementedException();
    }

    @Override
    public Role save(Role race) {
        throw new NotImplementedException();
    }

    @Override
    public Role update(Long id, Role race) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Role race) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Long id) {
        throw new NotImplementedException();
    }
}
