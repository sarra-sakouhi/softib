package com.entities.transaction;

import javax.persistence.OneToOne;

import com.entities.bankAccount.BankAccount;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transfer extends Transaction {

	@OneToOne
	private BankAccount destinationAccount;

}
