package com.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "Messi", 10000);
		try {
			FileOutputStream fos = new FileOutputStream("employee.dat"); //Open the file in the write mode so that I can add Object
			ObjectOutputStream oos = new ObjectOutputStream(fos); //Create objectOutputStream to pass object as output
			oos.writeObject(e1);
			System.out.println("Object is serialized");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Deserialization
		
		
		FileInputStream fis = new FileInputStream("employee.dat");
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(fis);
			Employee retrivedEmployee = (Employee) ois.readObject();
			System.out.println(retrivedEmployee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
