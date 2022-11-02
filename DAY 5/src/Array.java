
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = new int[] {10,20,30,40,50};
		
		for(int value:data) {
			System.out.println(value);
		}
		
		//Array creation of Objects
		
		Employee[] employeArray = new Employee[] {new Employee("Pedri", 8),new Employee("Gavi", 6),new Employee("FDJ", 21)};
		
//		employeArray[0] = new Employee("Pedri", 6);
//		employeArray[1] = new Employee("Gavi", 6);
//		employeArray[2] = new Employee("FDJ", 6);
		for(Employee emp:employeArray) {
			System.out.println(emp);
			
		}

	}

}
