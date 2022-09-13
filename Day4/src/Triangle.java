// height is 3 times of base
public class Triangle {
	private double height,base,area; //Tight Encapsulation
	
	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

	public Triangle(double base) {
		this.base = base;
		this.height = this.base*3;
	}
	
	public double printArea() {
		
		area = 0.5 * base * height;
		return area;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle(5);
		System.out.println("Base of Triangle "+triangle.getBase());
		System.out.println("Height of Triangle "+triangle.getHeight());
		double area = triangle.printArea();
		System.out.println(area);

	}

}
