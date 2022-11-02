public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private static double totalBalance=0;
	
	public BankAccount(int accountId, String accountHolderName, double openingBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		if(openingBalance>0) {
			this.openingBalance=this.currentBalance = openingBalance;
			totalBalance+=openingBalance;
		}else {
			System.out.println("Opening balance can not be less than zero");
		}
		
	}
	public int getAccountId() {
		return accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void withdrawAmount(double amt) {
		if(amt<=currentBalance && totalBalance>=amt) {
			this.currentBalance=this.currentBalance-amt;
			totalBalance=totalBalance-amt;
			System.out.println("Withdraw Successfull :"+amt+" deducted from "+this.accountHolderName);
		}
		else {
			if(amt>this.currentBalance) {
				System.out.println("Amount is greater than current Balance, Please try with different Amount");
			}
			else  {
				System.out.println("Amount is greater than total amount in bank , Please try with different Amount");
			}
		}
	}
	public void depositAmount(double amt) {
		totalBalance+=amt;
		currentBalance+=amt;
		System.out.println(amt+" deposited in "+this.accountHolderName);
	}
	 public double getCurrentBalance() {
		 return currentBalance; 
	 }
	 public static void displayTotalBalance() {
		 System.out.println("Total available cash in bank is :"+totalBalance);
	 }
	 
}