package com.softib.services.credit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softib.entities.credit.Credit;
import com.softib.exceptions.RessourceNotFoundException;
import com.softib.repositories.credit.ICreditRepository;

@Service
public class CreditServiceImpl implements IcreditService{

	@Autowired
	private ICreditRepository creditRepository;

	public List<Credit> getAllCredits() {

	return creditRepository.findAll();

	}

	public Credit createCredit(Credit credit) {

	return creditRepository.save(credit);

	}

	public Credit getCreditById(long id) {

	return creditRepository.findById(id)
	.orElseThrow(() -> new RessourceNotFoundException("Credit not found with id " + id));
	}

	public Credit updateCredit(long id, Credit creditToUpdate) {

	Credit credit = creditRepository.findById(id)
	.orElseThrow(() -> new RessourceNotFoundException("Credit not found with id " + id));

	//Credit.setCredit(creditToUpdate.getCredit());

	Credit Updatedcredit = creditRepository.save(credit);
	
	return Updatedcredit;

	}

	public void deleteCredit(long id) {

	Credit credit = creditRepository.findById(id)
	.orElseThrow(() -> new RessourceNotFoundException("Credit not found with id " + id));

	creditRepository.delete(credit);

	}
}
