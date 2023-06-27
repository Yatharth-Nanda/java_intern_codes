package com.hospital.dao;
import com.hospital.model.Patient;


public interface patientDao {
	public void addPatient(int id,String pname);
	public void addDiseaseHist(String dis,Patient p);
	public void assigndoc(int id,int pid);
	public Patient getPatientById(int id);

}
