package com.softib.services.transaction;

import java.util.List;

import com.softib.entities.comptebancaire.CompteBancaire;
import com.softib.entities.transaction.Transaction;

public interface ITransactionService {

	public List<Transaction> findTransactionByCompteBancaireAndTransactionType(CompteBancaire compteBancaire,
			String typeTransaction);

	public List<Transaction> getTransactionsByCompte(CompteBancaire compte);

	public void saveTransaction(Transaction transaction);
}
