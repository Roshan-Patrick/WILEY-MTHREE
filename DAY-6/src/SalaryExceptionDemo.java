
public class SalaryExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			calculateGrossSalary(21000);
		} catch (SalaryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

	private static void calculateGrossSalary(int basicSalary) throws SalaryException {
		// TODO Auto-generated method stub
		if(basicSalary < 20000)
			throw new SalaryException();
		else
			System.out.println("Salary paid");
		
	}

}
