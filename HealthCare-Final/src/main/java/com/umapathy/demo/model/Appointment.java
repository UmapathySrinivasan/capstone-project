package com.umapathy.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
//-----------------------------Appointment_Entity-----------------------------
public class Appointment {
	
	//-----------------------------Respective Data For Appointment_Entity------------
	@Id
	private int id;
	private String date;
	private String time;
	private String status;
	
	//----------------------Bidirecttional_Relationship for Entity Class-----------	 
	
	@OneToOne(cascade = CascadeType.ALL)
	private DiagnosticCenter diagnosticCenter;
	

	//------------------------Creating a Getter&setters------------------------
		//---------------We can also use lambook for that--------------



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", date=" + date + ", time=" + time + ", status=" + status
				+ ", diagnosticCenter=" + diagnosticCenter + "]";
	}

	public Appointment(int id, String date, String time, String status, DiagnosticCenter diagnosticCenter) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.status = status;
		this.diagnosticCenter = diagnosticCenter;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}



}

	
	
	


	


