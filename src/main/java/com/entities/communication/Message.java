package com.entities.communication;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.entities.user.Utilisateur;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Utilisateur emetteur;
	@OneToMany
	private List<Utilisateur> utilisateursCible;
	private String message;
	private Date date;
	private boolean vu;
}
