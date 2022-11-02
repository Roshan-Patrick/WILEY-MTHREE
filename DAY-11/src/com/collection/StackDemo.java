package com.collection;

import java.util.Stack;
//Extends vector class and works on LIFO algo
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> animals = new Stack();
		
		animals.push("Dog");
		animals.push("Cat");
		animals.push("Pig");
		
		System.out.println(animals);
		
		animals.pop();
		System.out.println(animals);
		
		System.out.println(animals.peek());
		
		System.out.println(animals);
		

	}

}
