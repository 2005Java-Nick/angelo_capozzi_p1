package com.revature.trms.domain;

public class EventForm {
	private int id;
	private String name;
	private String reimb;
	


	public EventForm(int id, String name, String reimb) {
		super();
		this.id = id;
		this.name = name;
        this.reimb = reimb;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getReimb() {
		return reimb;
	}

	public void setReimb(String reimb) {
		this.reimb = reimb;
	}
	
	
}
