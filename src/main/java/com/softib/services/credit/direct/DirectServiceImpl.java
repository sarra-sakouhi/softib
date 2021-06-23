package com.softib.services.credit.direct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softib.services.credit.CreditServiceImpl;

@Service
public class DirectServiceImpl implements IdirectService {

	@Autowired
	CreditServiceImpl creditServiceImpl;

}
