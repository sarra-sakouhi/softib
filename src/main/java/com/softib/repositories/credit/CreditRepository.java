package com.softib.repositories.credit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softib.entities.credit.Credit;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {

}
