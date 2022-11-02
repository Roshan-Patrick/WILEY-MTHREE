//Super class

public class Animal {
	
	Animal(){
		this("pet");
//		System.out.println("In the contructor of Animal");
	}
	
	
	
	Animal(String animlaType){
		System.out.println("Parameterized contructor is invoked");
	}

	
	public void talk() {
		System.out.println("Talking generically");

	}
	public void eat() {
		System.out.println("Eating generically");

	}
	public void sleep() {
		System.out.println("Sleeping generically");

	}
	public void breath() {
		System.out.println("Breathing generically");

	}

}
