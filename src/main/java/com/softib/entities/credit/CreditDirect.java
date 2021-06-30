package com.softib.entities.credit;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DIRECT")
public class CreditDirect extends Credit {

}
