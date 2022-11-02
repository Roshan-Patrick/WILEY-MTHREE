// Using extends keyword, you create subclass of existing class, which behaves like this.
public class Dog extends Animal{
	
//	Dog(String name){
//		super(); //Automatically creates by JVM
//		System.out.println("In parameterized constructor");
//	}
	
	Dog(){
//		super("pet");
//	    super(); //invokes the default constructor of super class
//		this("Pappu");
		System.out.println("In the Contructor of Dog");
	}
	
	
	//Method Overriding
	public void talk() {
		System.out.println("Dog Barks");
	}
	public void read() {
		System.out.println("Dog Reads");
		
	}
	
	public void TrainMe() {
		System.out.println("Dog trains");
	}
	
	
	
	

}
