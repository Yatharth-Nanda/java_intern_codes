package com.hospital.model;

public class Doctor {
	  private int docId;
	  private String   docName;
	public int getDocId() {
		return docId;
	}
	public String getDocName() {
		return docName;
	}
	@Override
	public String toString() {
		return "Doctor docId:" + docId + ", docName:" + docName ;
	}
	public Doctor(int docId, String docName) {
		super();
		this.docId = docId;
		this.docName = docName;
	}
  
}  
  