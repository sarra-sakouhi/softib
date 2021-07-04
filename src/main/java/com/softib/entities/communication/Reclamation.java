package com.softib.entities.communication;

import javax.persistence.DiscriminatorValue;

import com.softib.entities.user.Departement;

@DiscriminatorValue("RECLAMATION")
public class Reclamation extends Message {
	private Departement departement;
	private boolean resolu;
}
