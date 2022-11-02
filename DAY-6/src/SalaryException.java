
public class SalaryException extends Exception{
	
		String message;
		SalaryException(){
			message = "Salary Exception occured";
		}
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return message;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Salary is not according to the norm";
		}
		
		

}
