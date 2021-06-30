package com.softib.services.credit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softib.entities.credit.Credit;
import com.softib.entities.credit.CreditDirect;
import com.softib.exceptions.RessourceNotFoundException;
import com.softib.repositories.credit.CreditDirectRepository;
import com.softib.repositories.credit.CreditImmobilierRepository;
import com.softib.repositories.credit.CreditRepository;
import com.softib.repositories.credit.CreditVoitureRepository;

@Service
public class CreditServiceImpl implements IcreditService{

	@Autowired
	private CreditRepository creditRepository;

	@Autowired
	private CreditDirectRepository CreditDirectRepository;

	@Autowired
	private CreditImmobilierRepository CreditImmobilierRepository;
	
	@Autowired
	private CreditVoitureRepository CreditVoitureRepository;

	
 
	public List<Credit> getAllCredits() {

	return creditRepository.findAll();

	}

	public Credit createCredit(Credit credit) {

	return creditRepository.save(credit);

	}
	
	public Credit addToDirect(CreditDirect credit) {
		
		return CreditDirectRepository.save(credit);

	}
	
	public CreditDirect getDirectById(long id) {

		return CreditDirectRepository.findById(id)
		.orElseThrow(() -> new RessourceNotFoundException("Credit direct not found with id " + id));
	}


	public Credit getCreditById(long id) {

	return creditRepository.findById(id)
	.orElseThrow(() -> new RessourceNotFoundException("Credit not found with id " + id));
	}

	public Credit updateCredit(long id, Credit creditToUpdate) {

	Credit credit = creditRepository.findById(id)
	.orElseThrow(() -> new RessourceNotFoundException("Credit not found with id " + id));
	
	credit.setActive(creditToUpdate.isActive());
	credit.setBankAccount(creditToUpdate.getBankAccount());
	credit.setCreditDate(creditToUpdate.getCreditDate());
	credit.setEchanceDate(creditToUpdate.getEchanceDate());
	credit.setMonthDuration(creditToUpdate.getMonthDuration());
	credit.setNbMonthsRemaining(creditToUpdate.getNbMonthsRemaining());
	credit.setRate(creditToUpdate.getRate());
	credit.setTmm(creditToUpdate.getTmm());
	credit.setTotalAmount(creditToUpdate.getTotalAmount());
	
	return creditRepository.save(credit);

	}

	public void deleteCredit(long id) {

	Credit credit = creditRepository.findById(id)
	.orElseThrow(() -> new RessourceNotFoundException("Credit not found with id " + id));

	creditRepository.delete(credit);

	}
}
