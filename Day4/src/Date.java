
public class Date {
	
	int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public String displayDate() {
		return dd + "/" + mm + "/" + yy;

	}

}
