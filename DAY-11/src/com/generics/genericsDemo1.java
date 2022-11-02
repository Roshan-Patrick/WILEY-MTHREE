package com.generics;


class GenericsClass<T>{
	private T data;

	public GenericsClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return this.data;
	}
	

}

public class genericsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsClass<Integer> intObj = new GenericsClass<>(5);
		System.out.println(intObj.getData());
		
		GenericsClass<String> stringObj = new GenericsClass<>("Hello World");
		System.out.println(stringObj.getData());

	}

}
