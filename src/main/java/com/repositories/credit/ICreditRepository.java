package com.repositories.credit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.credit.Credit;

public interface ICreditRepository extends JpaRepository<Credit, Long> {

}
