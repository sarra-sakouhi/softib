package com.softib.entities.credit;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.softib.entities.comptebancaire.CompteBancaire;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Credit {
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
