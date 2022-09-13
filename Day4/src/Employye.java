
public class Employye {
	
	int empId;
	String empName;
//	int empCounter; // instant variable, the initial value is 0
	
	static int empCounter; // class variable, shared across all the objects, default value as 0
	
	public Employye(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		System.out.println("Counter increased by one...");
		empCounter++;
	}
	
	static {
		System.out.println("In static Block");
		empCounter = 100;
	}
	
	//static method is used to process static members
	//this method can be invoked without object, should be invoked with class name
	//static method is not dedicated to any of the object, you cannot use keyword or instant variables inside the static method
	
	public static int EmployeeCounter() {
		return empCounter;
	}

	public static void main(String[] args) {
		
		System.out.println("Inside the main");
		Employye employye1 = new Employye(101, "abc");
		Employye employye2 = new Employye(102, "def");
		Employye employye3 = new Employye(103, "xyz");
		
		System.out.println("Counter : "+ employye3.EmployeeCounter());
	}

}
