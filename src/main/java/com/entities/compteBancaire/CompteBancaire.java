package com.entities.compteBancaire;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

import com.entities.user.Client;
import com.entities.user.Utilisateur;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double solde;
	private String rib;
	private String libele;
	private boolean active;
	private Date dateCreation;
	private Date dateDerniereAction;
	private AccountType typeCompte;
	@OneToOne
	private Client client;

}
