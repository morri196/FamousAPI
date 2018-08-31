package co.grandcircus.famouslab.model;

import java.util.List;

public class Complete {
	
	private List<Complete> complete;
	private String firstName;
	private String lastName;
	private String innovation;
	private String year;
	public Complete(List<Complete> complete, String firstName, String lastName, String innovation, String year) {
		super();
		this.complete = complete;
		this.firstName = firstName;
		this.lastName = lastName;
		this.innovation = innovation;
		this.year = year;
	}
	public Complete() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Complete> getComplete() {
		return complete;
	}
	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInnovation() {
		return innovation;
	}
	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return complete + "," + firstName + "," + lastName
				+ "," + innovation + "," + year;
	}
	
}