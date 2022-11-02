
public class AnimalApp {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dog dog = new Dog();
//		dog.breath();
//		dog.eat();
//		
//		dog.talk(); //if the method is available in subclass, then the subclass method is invoked, or super class is invoked.
		
		
		Animal animal = new Dog();  //superclass ref = new subclass();
		animal.talk();
//		animal.read() //Shows error coz the read method is not available in the super class- Polymorphic reference/ Dynamic method Dispatch
		
		((Dog) animal).TrainMe(); //Downcasting
	}

}
