package com.softib.services.transaction.virement;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softib.entities.comptebancaire.CompteBancaire;
import com.softib.entities.transaction.Transaction;
import com.softib.entities.transaction.Virement;
import com.softib.services.comptebancaire.CompteBancaireServiceImpl;
import com.softib.services.transaction.TransactionServiceImpl;
import com.softib.utils.comptebancaire.CompteBancaireUtils;

@Transactional
@Service
public class VirementServiceImpl implements IVirementService {
	@Autowired
	TransactionServiceImpl transactionServiceImpl;
	@Autowired
	CompteBancaireServiceImpl compteBancaireServiceImpl;

	public List<Transaction> getListVirementByCompteAndType(CompteBancaire compteBancaire) {
		return transactionServiceImpl.findTransactionByCompteBancaireAndTransactionType(compteBancaire, "VIREMENT");
	}

	@Override
	public void doVirementByCompte(CompteBancaire source, CompteBancaire distination, double montant) {
		if (CompteBancaireUtils.checkSoldeDisponible(source, montant)) {
			source.setSolde(source.getSolde() - montant);
			distination.setSolde(distination.getSolde() + montant);
			compteBancaireServiceImpl.updateCompteBancaire(source);
			compteBancaireServiceImpl.updateCompteBancaire(distination);
		}
	}

	@Override
	public void saveVirement(CompteBancaire source, CompteBancaire distination, double montant,
			String libeleTransaction) {
		Transaction virement = new Virement();
		virement.setMontant(montant);
		virement.setCompteSource(source);
		virement.setLibeleTransaction(libeleTransaction);
		virement.setDate(new Date());
		transactionServiceImpl.saveTransaction(virement);
	}

}
