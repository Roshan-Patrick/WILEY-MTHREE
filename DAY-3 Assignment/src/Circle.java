
public class Circle {
	
	double area,radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		area = (22/7)*radius*radius;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		double area = c.calculateArea();
		System.out.println("Area = " + area);
		
		

	}

}
