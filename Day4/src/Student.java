// Object inserted as a part of the object - Containment, has -a kinda relationship
public class Student {
	int StudentRegNo;
	String StudentName;
	Date DtOfAdmission;
	
	

	public Student(int studentRegNo, String studentName, Date dtOfAdmission) {
		super();
		StudentRegNo = studentRegNo;
		StudentName = studentName;
		DtOfAdmission = dtOfAdmission;
	}
	
	public void displayStudent() {
		System.out.println(this.StudentRegNo + " " + this.StudentName + " " + "DOA :" + " " + this.DtOfAdmission.displayDate());
		
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(24,06,87);
		Student student = new Student(101,"Neymar",date);
		student.displayStudent();
		

	}

}
