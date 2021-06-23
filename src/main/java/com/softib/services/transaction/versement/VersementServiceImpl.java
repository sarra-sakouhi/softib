package com.softib.services.transaction.versement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softib.entities.comptebancaire.CompteBancaire;
import com.softib.entities.transaction.Transaction;
import com.softib.services.transaction.TransactionServiceImpl;

@Service
public class VersementServiceImpl implements IVersementService {
	@Autowired
	TransactionServiceImpl transactionServiceImpl;

	public List<Transaction> getListVersementByCompteAndType(CompteBancaire compteBancaire) {
		return transactionServiceImpl.findTransactionByCompteBancaireAndTransactionType(compteBancaire, "VERSEMENT");
	}

}
