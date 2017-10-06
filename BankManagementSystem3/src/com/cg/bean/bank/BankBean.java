package com.cg.bean.bank;

public class BankBean {
	
	private int cID;
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	private String customerName;
	private String phoneNo;
	private String password;
	private String reenterPassword;
	public BankBean(int cID,String customerName, String phoneNo,
			String password, String reenterPassword) {
		super();
		this.cID=cID;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.password = password;
		this.reenterPassword = reenterPassword;
	}
	public BankBean() {
		
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReenterPassword() {
		return reenterPassword;
	}
	public void setReenterPassword(String reenterPassword) {
		this.reenterPassword = reenterPassword;
	}
	
	



	
}
