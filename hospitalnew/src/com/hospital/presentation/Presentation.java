package com.hospital.presentation;

import com.hospital.dao.*;

public class Presentation {
public static void main(String[] args) {
	
	
	
	patientDaoImpl pobj=new patientDaoImpl();
	pobj.addPatient(1, "Yatharth Nanda");
	doctorDaoImpl dobj=new doctorDaoImpl();
	dobj.addDoctor(101, "Gopi");
	pobj.assigndoc(101, 1);
	System.out.println(pobj.getPatientById(1));
	pobj.addDiseaseHist("Cough", pobj.getPatientById(1));
	System.out.println(pobj.getPatientById(1));
	
}
}
