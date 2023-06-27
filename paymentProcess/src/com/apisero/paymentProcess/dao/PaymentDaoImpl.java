package com.apisero.paymentProcess.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;



import com.apisero.paymentProcess.model.Payment;
import com.apisero.paymentProcess.util.Databaseutil;


public class PaymentDaoImpl implements PaymentDao{
	private Connection con=null;
	private Statement st=null;
	private ResultSet rs=null;
	private PreparedStatement pst=null;
	String getRecord="select * from paymentuser where customerNumber=? order by paymentdate,amount ";
	String getRecordByYear="select * from paymentuser where YEAR(paymentdate)=?";
	String getAllRecord=" select * from paymentuser";
	public PaymentDaoImpl()
	{
	try {
	con=Databaseutil.getConnection();
	 //st=con.createStatement();
	}
	catch(ClassNotFoundException e)
	{
	e.printStackTrace();
	}
	catch(FileNotFoundException e)
	{
	e.printStackTrace();
	}
	catch(SQLException  e)
	{
	e.printStackTrace();
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}
	
	}
	@Override
	public List<Payment>findCustomerById(int custno) throws SQLException {
		// TODO Auto-generated method stub
		List<Payment>plist=new ArrayList<>();
		Payment p=null;
		pst=con.prepareStatement(getRecord);
		pst.setInt(1, custno);
		rs=pst.executeQuery();
		while(rs.next())
		{	p=new Payment();
		p.setCustomerNumber(rs.getInt(1));
		p.setChequeNumber(rs.getString(4));
		p.setPaymentDate(rs.getDate(2));
		p.setAmount(rs.getInt(3));
		plist.add(p);
		}
		
		
		
		
		
		return plist;
	}
	@Override
	public List<Payment> findCustomerByYear(int year) throws SQLException {
		// TODO Auto-generated method stub
		  List<Payment> plist = new ArrayList<>();
	        Payment p = null;
	        pst = con.prepareStatement(getRecordByYear);
	        pst.setInt(1, year);
	        rs = pst.executeQuery();
	        while (rs.next()) {
	            p = new Payment();
	            // Changes in the following lines
	            p.setCustomerNumber(rs.getInt("customerNumber"));
	            p.setChequeNumber(rs.getString("chequeNumber"));
	            p.setPaymentDate(rs.getDate("paymentDate"));
	            p.setAmount(rs.getInt("amount"));
	            plist.add(p);
	            }
		return plist;
	}
	@Override
	public List<Payment> getAllRecord() throws SQLException {
		// TODO Auto-generated method stub
		List<Payment> plist = new ArrayList<>();
        Payment p = null;
        st=con.createStatement();
       
        rs = st.executeQuery(getAllRecord);
        while (rs.next()) {
            p = new Payment();
            // Changes in the following lines
            p.setCustomerNumber(rs.getInt("customerNumber"));
            p.setChequeNumber(rs.getString("chequeNumber"));
            p.setPaymentDate(rs.getDate("paymentDate"));
            p.setAmount(rs.getInt("amount"));
            plist.add(p);
            }
	return plist;
	}
	

}
