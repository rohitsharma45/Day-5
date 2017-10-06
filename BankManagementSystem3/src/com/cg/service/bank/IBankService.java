package com.cg.service.bank;

import java.util.ArrayList;

import com.cg.bean.bank.BankBean;

public interface IBankService {

	int insertDetails(BankBean bean);
	ArrayList<BankBean> retrieveDetails();
}
