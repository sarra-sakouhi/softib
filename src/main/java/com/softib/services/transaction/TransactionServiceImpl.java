package com.softib.services.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softib.entities.comptebancaire.CompteBancaire;
import com.softib.entities.transaction.Transaction;
import com.softib.repositories.transaction.TransactionRepository;

@Service
public class TransactionServiceImpl implements ITransactionService {
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public List<Transaction> getTransactionsByCompte(CompteBancaire compte) {
		return transactionRepository.findByCompteSource(compte);
	}

	@Override
	public void saveTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}

	@Override
	public List<Transaction> findTransactionByCompteBancaireAndTransactionType(CompteBancaire compteBancaire,
			String typeTransaction) {
		return transactionRepository.findTransactionByCompteBancaireAndTransactionType(compteBancaire, typeTransaction);
	}

}
