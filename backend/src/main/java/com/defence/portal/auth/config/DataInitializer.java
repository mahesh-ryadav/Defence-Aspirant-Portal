package com.defence.portal.auth.config;

import com.defence.portal.auth.entity.ERole;
import com.defence.portal.auth.entity.Role;
import com.defence.portal.auth.repository.RoleRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;

    public DataInitializer(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {
        seedRoles();
    }

    private void seedRoles() {
        for (ERole eRole : ERole.values()) {
            if (roleRepository.findByName(eRole).isEmpty()) {
                Role role = new Role();
                role.setName(eRole);
                roleRepository.save(role);
            }
        }
    }
}