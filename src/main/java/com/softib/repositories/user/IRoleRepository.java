package com.softib.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softib.entities.user.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

}
