package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee e1 = new Employee("Messi", "Lionel");
//		Employee e2 = new Employee("Cristiano", "Ronaldo");
//		Employee e3 = new Employee("Messi", "Lionel");
//		Employee e4 = new Employee("Neymar", "Jr");
//		Employee e5 = new Employee("Luis", "Suaraz");
//		
//		ArrayList <Employee> empList = new ArrayList <Employee>(); 
//		empList.add(e1);
//		empList.add(e2);
//		empList.add(e3);
//		empList.add(e4);
//		empList.add(e5);
		
		List<Employee> empList =Arrays.asList(new Employee("Messi","Lionel"),new Employee("Cristiano","Ronaldo"),new Employee("Messi","Lionel"),new Employee("Neymar","Jr"),new Employee("Luis","Suaraz"));
        System.out.println(empList);
		
		for(Employee employee:empList)
			System.out.println(employee);
		
	}

}
