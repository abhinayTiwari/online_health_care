package VO;

import java.io.Serializable;

public class patientVO implements Serializable{
	private int  patientvo_id;
	private String patientvo_name;
	public int getPatientvo_id() {
		return patientvo_id;
	}
	public void setPatientvo_id(int patientvo_id) {
		this.patientvo_id = patientvo_id;
	}
	public String getPatientvo_name() {
		return patientvo_name;
	}
	public void setPatientvo_name(String patientvo_name) {
		this.patientvo_name = patientvo_name;
	}
	
	
}
