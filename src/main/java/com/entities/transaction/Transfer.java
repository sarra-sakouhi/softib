package com.entities.transaction;

import javax.persistence.OneToOne;

import com.entities.compteBancaire.BankAccount;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transfer extends Transaction {

	@OneToOne
	private BankAccount destinationAccount;

}
