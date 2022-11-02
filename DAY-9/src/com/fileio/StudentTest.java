package com.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Messi", 8.2, "Goat10", new Date(24,8,2000));
		serializeStudent(student1);
		Student s = deserializeStudent();
		System.out.println(s);

	}

	private static Student deserializeStudent() {
		// TODO Auto-generated method stub
		Student s=null;
		try {
			FileInputStream fis = new FileInputStream("Student.txt");
			ObjectInputStream oip = new ObjectInputStream(fis);
			s = (Student) oip.readObject(); 
			System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}

	private static void serializeStudent(Student student1) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student1);
			System.out.println("Object is serialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
