package com.softib.repositories.credit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.softib.entities.credit.CreditImmobilier;

@Repository
public interface CreditImmobilierRepository extends JpaRepository<CreditImmobilier, Long> {

}
