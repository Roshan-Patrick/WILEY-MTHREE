package com.fileio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
		String name;
		double cgpa;
		String regNo; //Transient variables are not part of Serialization.
		transient Date dateofAdmission;
		public Student(String name, double cgpa, String regNo, Date dateofAdmission) {
			super();
			this.name = name;
			this.cgpa = cgpa;
			this.regNo = regNo;
			this.dateofAdmission = dateofAdmission;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", cgpa=" + cgpa + ", regNo=" + regNo + ", dateofAdmission="
					+ dateofAdmission + "]";
		}
		
		public void writeObject(ObjectOutputStream oos) throws IOException {
			oos.defaultWriteObject(); //serialize the object in default way
			oos.writeObject(dateofAdmission);
			oos.close();
		}
		public void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
			ois.defaultReadObject();
			Date d = (Date) ois.readObject();
			this.dateofAdmission=d; 
			ois.close();
			
		}

}
