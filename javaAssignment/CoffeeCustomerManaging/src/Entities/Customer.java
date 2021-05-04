package Entities;

import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	
	private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String NationalityId;
    
    
	public Customer() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = (Date) dateOfBirth;
	}


	public String getNationalityId() {
		return NationalityId;
	}


	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}