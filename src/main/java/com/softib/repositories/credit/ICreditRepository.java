package com.softib.repositories.credit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softib.entities.credit.Credit;

public interface ICreditRepository extends JpaRepository<Credit, Long> {

}
