package com.entities.bankAccount;

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
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double solde;
	private String rib;
	private String label;
	private boolean active;
	private Date creationDate;
	private Date lastActionDate;
	private AccountType accountType;
	@OneToOne
	private Client client;

}
