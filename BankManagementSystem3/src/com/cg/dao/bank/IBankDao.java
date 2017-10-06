package com.cg.dao.bank;

import java.util.ArrayList;

import com.cg.bean.bank.BankBean;

public interface IBankDao {


	int insertDetails(BankBean bean);
	ArrayList<BankBean> retrieveDetails();
}
