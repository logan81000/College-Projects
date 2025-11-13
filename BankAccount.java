package Critical_Thinking;

public class BankAccount {
	private String First = "";
	private String Last = "";
	private static int ID = 15;
	private static double balance;
	
	BankAccount(){
		balance = 0;
	}
	public static void Deposit(double deposit) {
		balance = balance + deposit;
	}
	
	public static void Withdraw(double with) {
		balance = balance - with;
	}
	public static double getBalance() {
		return balance;
	}
	public static void accountSummary() {
		System.out.println("Your balance for checking account ID " + ID + " is " + balance + " dollars");
	}
	
	public String getFirst() {
		return this.First;
		
	}
	
	public String getLast() {
		return this.Last;
		
	}
	
	public double getID() {
		return this.ID;
		
	}
	
	public void setID(int newID) {
		ID = newID;
		
	}
	
	public void setLast(String newLast) {
		Last = newLast;
		
	}
	
	public void setFirst(String newFirst) {
		First = newFirst;
		
	}
	

	public static void main(String[] args) {

	}

}
