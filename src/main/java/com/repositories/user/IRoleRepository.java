package com.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.user.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

}
