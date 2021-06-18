package com.entities.credit;

import java.util.Date;

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
public abstract class Credit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double totalAmount;
	private Date echanceDate;
	private short monthDuration;
	private double rate;
	private Date creditDate;
	private double tmm;
	private short nbMonthsRemaining;
	private boolean active;
	@OneToOne
	private CompteBancaire bankAccount;

}
