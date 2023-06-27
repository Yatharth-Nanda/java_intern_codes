package model;

public class User {
private String custName;
private String accno;
private int curr_bal;
private String profilepassword;
private int upipin;


public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
}
public int getCurr_bal() {
	return curr_bal;
}
public void setCurr_bal(int curr_bal) {
	this.curr_bal = curr_bal;
}


public String getProfilepassword() {
	return profilepassword;
}
public void setProfilepassword(String profilepassword) {
	this.profilepassword = profilepassword;
}

public int getUpipin() {
	return upipin;
}
public void setUpipin(int upipin) {
	this.upipin = upipin;
}
public User(String custName, String accno, int curr_bal,String profilepass, int upipin) {
	super();
	this.custName = custName;
	this.accno = accno;
	this.curr_bal = curr_bal;
	this.profilepassword=profilepass;
	this.upipin=upipin;
}
@Override
public String toString() {
	return "The customer name is " + custName + "with accno=" + accno + " and has balance =" + curr_bal ;
}






}
