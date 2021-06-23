package com.softib.services.credit;

import java.util.List;

import com.softib.entities.credit.Credit;

public interface IcreditService {
	
	public List<Credit> getAllCredits();

	public Credit createCredit(Credit credit);

	public Credit getCreditById(long id);

	public void updateCredit(long id, Credit Credit);

	public void deleteCredit(long id);

}
