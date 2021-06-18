package com.repositories.CompteBancaire;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.compteBancaire.CompteBancaire;

public interface CompteBancaireRepository extends JpaRepository<CompteBancaire, Long> {

}
