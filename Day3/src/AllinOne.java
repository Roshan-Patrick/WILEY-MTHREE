
public class AllinOne {
	
	public int IfElse(int x, int y){
		if(x>y)
			return x;
		else
			return y;
		
	}
	public int forLoop(int n) {
	    int total=1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
           }
        return total;
			
	}
	
	public int whileLoop(int n) { 
	    int result=0;
	    int i=1;
	    while(i<=n) {
	      result+=i;
	      i++;
	    } 
	    return result;
	  }
	
	public void switchstatement(int n){
		
		
		switch(n) {
		
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;	
		default:
			System.out.println("INVALID");
		}
	}
	
	public void breakstatement() {
		for(int i=1;i<5;i++) {
			System.out.println(i);
			if(i==3)
				break;
		}
	}
	public void continuestatement() {
			for(int i=1;i<=5;i++) {
				if(i==3)
					continue;
				System.out.println(i);
			}	
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllinOne c = new AllinOne(); //Created the instance of the object
		
		int ifelse = c.IfElse(10,20);
		int forloop = c.forLoop(5);
		int whileloop = c.whileLoop(5);
		
	    System.out.println("IF ELSE : "+ifelse);
		System.out.println("FOR LOOP :"+forloop);
		System.out.println("WHILE LOOP : "+whileloop);
		System.out.println("SWITCH STATEMENT :");
		c.switchstatement(6);
		System.out.println("BREAK STATEMENT :");
		c.breakstatement();
		System.out.println("CONTINUE STATEMENT :");
		c.continuestatement();
		
		

	}

}
