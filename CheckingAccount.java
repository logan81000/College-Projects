package Critical_Thinking;
import java.util.*;

public class CheckingAccount extends BankAccount {
	private double interest = 0.45;
	static Scanner input = new Scanner(System.in);
	
	public static void processWithdrawl() {
		System.out.print("Would you like to withdraw from your Checking Account? (Y or N) ");
		String WithdrawYorN = input.next();
		if (WithdrawYorN.equals("Y")) {
			System.out.print("How much would you like to withdraw? ");
			double WithdrawA = input.nextDouble();
			if (WithdrawA > getBalance()) {
				Withdraw(WithdrawA + 30);
				System.out.println("A 30 dollar overdraft fee has been added to your account");
			} else {
				Withdraw(WithdrawA);
			}	
		}
	}
	
	public static void processDeposit() {
		System.out.print("Would you like to deposit to your Checking Account? (Y or N) ");
		String depositYorN = input.nextLine();
		if (depositYorN.equals("Y")) {
			System.out.print("How much would you like to deposit? ");
			double depositA = input.nextDouble();
			Deposit(depositA);
		}
		
	}
	
	public static void displayAccount() {
		System.out.print("Would you like a account summary? (Y or N) ");
		String display = input.next();
		if (display.equals("Y")) {
			accountSummary();
		}
		
		
	}

	public static void main(String[] args) {
		processDeposit();
		processWithdrawl();
		displayAccount();
		input.close();

	}
	

}
