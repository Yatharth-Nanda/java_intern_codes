package com.apisero.paymentProcess.service;

import java.sql.SQLException;
import java.util.List;

import com.apisero.paymentProcess.dao.PaymentDao;
import com.apisero.paymentProcess.dao.PaymentDaoImpl;
import com.apisero.paymentProcess.model.Payment;

public class paymentServiceImpl implements paymentService
{
PaymentDaoImpl daoobj=new PaymentDaoImpl();
	@Override
	public List<Payment> findCustomerById(int custno) throws SQLException {
		// TODO Auto-generated method stub
		return daoobj.findCustomerById(custno);
	}

	@Override
	public List<Payment> findCustomerByYear(int year) throws SQLException {
		// TODO Auto-generated method stub
		return daoobj.findCustomerByYear(year);
	}

	@Override
	public List<Payment> getAllRecord() throws SQLException {
		// TODO Auto-generated method stub
		return daoobj.getAllRecord();
	}

}
