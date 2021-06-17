package com.entities.transaction;

import javax.persistence.OneToOne;

import com.entities.compteBancaire.CompteBancaire;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transfer extends Transaction {

	@OneToOne
	private CompteBancaire destinationAccount;

}
