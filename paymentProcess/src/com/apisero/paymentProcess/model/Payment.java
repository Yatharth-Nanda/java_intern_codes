package com.apisero.paymentProcess.model;

import java.sql.Date;

public class Payment {
	 int customerNumber ;
	 String chequeNumber;
	 Date paymentDate ;
	 int amount;
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Payment was done by Customer having customer number:" + customerNumber + ", chequeNumber=" + chequeNumber + ", paymentDate="
				+ paymentDate + ", amount=" + amount ;
	}
	
	 
}
