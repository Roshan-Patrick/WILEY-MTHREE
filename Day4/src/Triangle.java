// height is 3 times of base
public class Triangle {
	double height,base,area;
	
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
		double area = triangle.printArea();
		System.out.println(area);

	}

}
