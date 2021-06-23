package com.softib.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softib.entities.user.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
