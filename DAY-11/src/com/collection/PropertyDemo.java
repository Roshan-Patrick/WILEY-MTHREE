package com.collection;

import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		
		p.setProperty("No1", "Messi");
		p.setProperty("No2", "Ronaldo");
		p.setProperty("No3", "Neymar");
		
		System.out.println(p);
		System.out.println(p.getProperty("No3"));
		
		System.out.println(System.getProperties());

	}

}
