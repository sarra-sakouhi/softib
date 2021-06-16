package com.entities.demande;

import com.entities.compteBancaire.AccountType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DemandeCompteBancaire extends Demande {

	private AccountType typeDeCompte;

}
