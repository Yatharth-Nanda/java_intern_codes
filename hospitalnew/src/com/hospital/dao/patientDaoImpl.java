package com.hospital.dao;

import java.util.HashMap;
import java.util.Map;


import com.hospital.model.Patient;

public class patientDaoImpl implements patientDao {
	Map<Integer,Patient>m=new HashMap<>();
	
		
		@Override
		public void addPatient(int id, String pname) {
			Patient p1=new Patient(id,pname);
			m.put(Integer.valueOf(p1.getPatientId()), p1);
		}


		

		@Override
		public void addDiseaseHist(String dis, Patient p) {
			// TODO Auto-generated method stub
			p.setDiseashist(dis);
		}


		@Override
		public void assigndoc(int did, int  pid) {
			// TODO Auto-generated method stub
			m.get(pid).setAssigndoc(did);
					
			
		}




		@Override
		public Patient getPatientById(int id) {
			// TODO Auto-generated method stub
			return m.get(id);
		}
}
