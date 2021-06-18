package com.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.user.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
