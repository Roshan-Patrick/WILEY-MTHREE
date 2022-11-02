
public class Employee implements Cloneable  {
	private String empName;
	private int empId;
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	
	//String representation of object
	@Override
	public String toString() {
		return this.empName + " " + this.empId;
	}
	
	//superclass ref = new subclass();
	// Object obj = new Employee();
	// Used to check the equality of the object
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj; //Downcasting 
		if(this.empName == e.empName)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return this.empId*8;
		return super.hashCode();
	}
	
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Messi", 102);
	//	System.out.println(e1); //invokes the toString() method implicitly
		Employee e2 = new Employee("Neymar", 101);
	//	Employee e2 = e1;
		
		if(e1.equals(e2))
			System.out.println("Equal");
		else	
			System.out.println("Not equal");
		
		System.out.println(e1.hashCode());
		
		Employee e3 = (Employee)e2.clone(); //any predefined method which returns the object, has the return type of object class type
		System.out.println(e2);
		System.out.println(e3);
		
		
	}
	
	

	
}
