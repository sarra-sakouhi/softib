package com.softib.repositories.transaction;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.softib.entities.comptebancaire.CompteBancaire;
import com.softib.entities.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findByCompteSource(CompteBancaire compteBancaire);

	@Query(value = "SELECT t FROM Transaction t WHERE t.compteSource = :compteBancaire and t.typetransaction = :typetransaction", nativeQuery = true)
	List<Transaction> findTransactionByCompteBancaireAndTransactionType(
			@Param("compteBancaire") CompteBancaire compteBancaire, @Param("typetransaction") String typetransaction);
}
