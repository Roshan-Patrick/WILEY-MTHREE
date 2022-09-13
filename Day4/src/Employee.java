
public class Employee {
	
	int empid;
	String empName;
	
	public Employee() {
//		this(102,"Ronaldo");  Parameterized constructor is invoked
		System.out.println("Default constructor is invoked");
	}
	
	public Employee(int empid, String empName) {
//		this();     Default Contructor is invoked
		System.out.println("Parameterized Constructor is invoked");
		this.empid = empid;
		this.empName = empName;
	}
	
	public void printEmployee() {
		System.out.println(this.empid + " , " + this.empName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(101, "Messi");
		emp2.printEmployee();

	}

}
