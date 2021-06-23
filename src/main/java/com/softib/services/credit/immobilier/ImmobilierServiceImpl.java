package com.softib.services.credit.immobilier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softib.services.credit.CreditServiceImpl;

@Service
public class ImmobilierServiceImpl implements IimmobilierService {

	@Autowired
	CreditServiceImpl creditServiceImpl;

}
