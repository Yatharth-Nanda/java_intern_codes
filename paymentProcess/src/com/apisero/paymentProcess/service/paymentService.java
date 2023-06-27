package com.apisero.paymentProcess.service;

import java.sql.SQLException;
import java.util.List;

import com.apisero.paymentProcess.model.Payment;

public interface paymentService {
	public List <Payment> findCustomerById(int custno) throws SQLException;
	public List<Payment>findCustomerByYear(int year) throws SQLException;

	public List<Payment>getAllRecord()throws SQLException;
}
