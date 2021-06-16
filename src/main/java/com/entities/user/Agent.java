package com.entities.user;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Agent extends Utilisateur {
	private Poste poste;
	private Date dateEmbauche;
	private String matricule;
	private Departement departement;

}
