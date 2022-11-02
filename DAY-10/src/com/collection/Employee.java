package com.collection;

public class Employee implements Comparable<Employee> {
	private String firstName,lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public int hashCode() {
		return this.firstName.length();
	}
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Equals method invoked");
		Employee e = (Employee) obj;
		return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) ;
	}

	@Override
	public String toString() {
		return "FirstName=" + this.firstName + " LastName=" + this.lastName +"\n";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.lastName.compareTo(o.lastName);
	}

}
