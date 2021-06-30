package com.softib.repositories.credit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.softib.entities.credit.CreditVoiture;

@Repository
public interface CreditVoitureRepository extends JpaRepository<CreditVoiture, Long> {

}
