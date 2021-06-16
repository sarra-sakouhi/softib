package com.entities.user;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personne extends Client {

	private String prenom;
	private long cin;
	private String metier;
	private Sexe sexe;
	private double salaire;
	private EtatCivil etatCivil;
	private Date dateDeNaissance;

}
