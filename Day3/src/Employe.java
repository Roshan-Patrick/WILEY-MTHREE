	public class Employe {
	private int empno;   //Fields
	private String name;
	protected float salary;
	private String dname;
	
	Employe(){
		empno = 0;
		name = "";
		salary = 0.0f;
		dname = "";
	}

	public Employe(int empno, String name, float salary, String dname) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.dname = dname;
	}
	
	public float computeNetSalary(int all, int ded) {
		return salary + all - ded;
	}
	
	class Manager extends Employe{
		private int no_of_sub;
		public Manager() {
			super();
			no_of_sub = 0;			
		}

		public Manager(int empno, String name, float salary, String dname, int no_of_sub) {
		super(empno, name, salary, dname);
			this.no_of_sub = no_of_sub;
		}
		
		public float computeNetSalary(int all, int ded) {
			return salary + (all*2) - ded;
			


		}

	
	class Programmer extends Employe{
		private int no_of_lines_code;
		String project_name;
		public Programmer() {
			super();
			no_of_lines_code = 0;
			project_name = "reservation";
			
		}

		public Programmer(int empno, String name, float salary, String dname, int no_of_lines_code, String project_name) {
		super(empno, name, salary, dname);
			this.no_of_lines_code = no_of_lines_code;
			this.project_name = project_name;
		}
		
		public float computeNetSalary(int all, int ded) {
			return salary + (all+300) - ded;
			}
		}
	
		
		
	}
}
