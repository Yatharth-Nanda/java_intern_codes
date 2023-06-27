package com.hospital.model;

public class Patient {
	private int patientId;
	private String patientName;
	private String diseashist;
	private int assigndoc;
	public int getPatientId() {
		return patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public Patient(int patientId, String patientName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", diseashist=" + diseashist
				+ " has assigned doctor as " + assigndoc + "]";
	}
	public String getDiseashist() {
		return diseashist;
	}
	public void setDiseashist(String diseashist) {
		this.diseashist = diseashist;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAssigndoc() {
		return assigndoc;
	}
	public void setAssigndoc(int assigndoc) {
		this.assigndoc = assigndoc;
	}
	

}
