public class BankAccountApp {
public static void main(String... args) {
	BankAccount b1=new BankAccount(1,"Roshan",1000);
	BankAccount.displayTotalBalance();
	
	BankAccount b2=new BankAccount(2,"Ronaldo",6000);
	BankAccount.displayTotalBalance();
	
	BankAccount b3=new BankAccount(3,"Ronaldinho",3500);
	BankAccount.displayTotalBalance();
	
	b1.withdrawAmount(5000);
	BankAccount.displayTotalBalance();
	
	b2.withdrawAmount(2343);
	System.out.println(b2.getCurrentBalance());
	BankAccount.displayTotalBalance();
	
	b3.depositAmount(2999);
	System.out.println(b3.getCurrentBalance());
	BankAccount.displayTotalBalance();
	
	b1.depositAmount(3343);
	BankAccount.displayTotalBalance();
	System.out.println(b1.getCurrentBalance());
	
	b3.withdrawAmount(4999);
	System.out.println(b3.getCurrentBalance());
	BankAccount.displayTotalBalance();

	BankAccount.displayTotalBalance();
}


}