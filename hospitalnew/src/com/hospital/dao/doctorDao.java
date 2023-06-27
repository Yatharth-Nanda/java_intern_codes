package com.hospital.dao;

import com.hospital.model.Doctor;

public interface doctorDao {
public void addDoctor(int id,String dname);
public Doctor returndocbyid(int id);
}
