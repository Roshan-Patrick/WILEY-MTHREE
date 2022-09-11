
public class Date {
	
	int dd,mm,yy;
	
	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
	public String displayDate() {
		return dd+ "/" +mm+ "/" + yy;
	}
	
	public boolean checkdate(){
		if(dd<31 && mm<12)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(24,06,1987);
		if(date.checkdate()==true) 
			System.out.println(date.displayDate());
		else
			System.out.println("Invalid Date Format");
			
		}
}
