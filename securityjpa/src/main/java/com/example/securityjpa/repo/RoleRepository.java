package com.example.securityjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.securityjpa.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
