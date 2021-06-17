package com.repositories.transaction;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
