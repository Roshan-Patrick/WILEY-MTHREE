
public enum Coffee {
	NESCAFFE(5), CAPACINO(7), LATTE(8), EXPRESSO(6);
	
	private int coffebeans;
	
	private Coffee(int coffebeans) {
		this.coffebeans = coffebeans;
	}	
		
	public void preparecoffee() {
		System.out.println("Your coffee is being prepared...");
	}
	public double calculateCoffee() {
		return this.coffebeans*20;
		
	}
}
