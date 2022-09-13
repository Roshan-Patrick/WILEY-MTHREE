
public class CoffeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee coffee = Coffee.LATTE;
		System.out.println("Your coffee is "+coffee);
		
		coffee.preparecoffee();
		System.out.println("Bill is "+coffee.calculateCoffee());
		
	}

}
 