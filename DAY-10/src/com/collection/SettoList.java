package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SettoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(1);
		System.out.println(a);
		//Type 1
		List<Integer> arr = new ArrayList<Integer>(a); //overloaded constructor of the list, which can take existing collection
		System.out.println(arr);
		System.out.println(arr.get(2));
		
		//Type 2
		List<Integer> arr1 = new ArrayList<Integer>();
		for(int i:a)
			arr1.add(i);
		System.out.println(arr1);
		
		List<Integer> arr2 = new ArrayList<Integer>();
		arr2.addAll(a); //addAll method takes existing collection to the list
		System.out.println(arr2);

	}

}
