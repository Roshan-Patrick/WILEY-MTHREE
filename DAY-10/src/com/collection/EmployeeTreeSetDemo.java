package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Messi", "Lionel");
		Employee e2 = new Employee("Cristiano", "Ronaldo");
		Employee e3 = new Employee("Messi", "Lionel");
		Employee e4 = new Employee("Neymar", "Jr");
		Employee e5 = new Employee("Luis", "Suaraz");
		
		Set<Employee> empSet = new TreeSet <Employee>(); 
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		System.out.println("Asending order by Last Name :");
		for(Employee emp:empSet)
			System.out.println(emp);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.addAll(empSet);
		Collections.sort(empList, new EmployeeSortByAscendingFirstName());
		System.out.println("Asending order by First Name :");
		for(Employee emp:empList)
			System.out.println(emp);


	}

}
