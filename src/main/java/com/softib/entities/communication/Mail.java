package com.softib.entities.communication;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("MAIL")
public class Mail extends Message {
	private String objet;
	private boolean draft;

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}
	
}
