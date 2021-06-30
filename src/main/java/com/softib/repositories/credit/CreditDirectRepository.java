package com.softib.repositories.credit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.softib.entities.credit.CreditDirect;

@Repository
public interface CreditDirectRepository extends JpaRepository<CreditDirect, Long> {

}
