package com.softib.entities.demande;

import com.softib.entities.comptebancaire.AccountType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DemandeCompteBancaire extends Demande {

	private AccountType typeDeCompte;

}
