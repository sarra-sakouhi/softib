package com.entities.transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.entities.compteBancaire.CompteBancaire;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public abstract class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	private CompteBancaire compteSource;
	private double montant;
	private String libeleTransaction;
	private long numeroTransaction;

}
