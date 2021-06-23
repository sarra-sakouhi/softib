package com.softib.services.credit.voiture;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softib.services.credit.CreditServiceImpl;

@Service
public class VoitureServiceImpl implements IvoitureService {

	@Autowired
	CreditServiceImpl creditServiceImpl;

}
