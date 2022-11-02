package com.collection;

import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Mango");
		fruitList.add("Orange");
		fruitList.add("Banana");
		
		//Converting List to Array
		System.out.println("Converting List to Array");
		String[] item = fruitList.toArray(new String[fruitList.size()]);
		for(String s:item)
			System.out.println(s);
		
		//Converting Array to List
		System.out.println("Converting Array to List");
		List<String>l2 = new ArrayList<String>();
		l2 = Arrays.asList(item);
		System.out.println(l2);

		
		

	}

}
