package com.softib.entities.transaction;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.softib.entities.comptebancaire.CompteBancaire;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("VIREMENT")
public class Virement extends Transaction {

	@OneToOne
	private CompteBancaire destinationAccount;

}
