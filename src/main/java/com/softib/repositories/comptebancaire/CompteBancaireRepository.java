package com.softib.repositories.comptebancaire;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softib.entities.comptebancaire.CompteBancaire;

public interface CompteBancaireRepository extends JpaRepository<CompteBancaire, Long> {

}
