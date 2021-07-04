package com.softib.entities.communication;

import java.util.List;
import java.util.Map;

import javax.persistence.DiscriminatorValue;

import com.softib.utils.communication.Filtre;

@DiscriminatorValue("INFORMATION")
public class Information extends Message {
	
	private List<Filtre> filtres;
	private boolean draft;
}
