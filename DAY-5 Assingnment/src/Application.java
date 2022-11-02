public class Application {
	public static void main(String args[]) {
		Employe e1=new Employe(101,"A",10000,"a1");
		Employe e2=new Employe(101,"A",20000,"a1");
		Employe e3=new Employe(103,"A",30000,"a3");
		Employe e4=new Employe(104,"D",40000,"a4");
		Employe e5=new Employe(105,"E",50000,"a5");
		
		Employe[] emp =new Employe[]{e1,e2,e3,e4,e5};
		Employe.sortEmployees(emp);
		Employe.SearchEmployees(emp,"A");
		System.out.println(	e1.equals(e2));
	
		
	
	}

}