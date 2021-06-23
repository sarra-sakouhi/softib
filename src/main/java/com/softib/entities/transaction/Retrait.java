package com.softib.entities.transaction;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RETRAIT")
public class Retrait extends Transaction {

}
