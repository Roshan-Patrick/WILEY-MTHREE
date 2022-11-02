package com.collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Messi", "Lionel");
		Employee e2 = new Employee("Cristiano", "Ronaldo");
		Employee e3 = new Employee("Messi", "Lionel");
		Employee e4 = new Employee("Neymar", "Jr");
		Employee e5 = new Employee("Luis", "Suaraz");
		
		Set<Employee> empSet = new HashSet <Employee>(); 
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		for(Employee emp:empSet)
			System.out.println(emp);
			

	}

}
