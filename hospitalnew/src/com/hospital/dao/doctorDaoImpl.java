package com.hospital.dao;
import java.util.HashMap;
import java.util.Map;

import com.hospital.model.Doctor;


public class doctorDaoImpl implements doctorDao {
	Map<Integer,Doctor>m=new HashMap<>();
	@Override
	public void addDoctor(int id, String dname) {
		Doctor d1=new Doctor(id,dname);
		m.put(Integer.valueOf(d1.getDocId()), d1);
	}
	@Override
	public Doctor returndocbyid(int id) {
		// TODO Auto-generated method stub
		return m.get(id);
	}

}
