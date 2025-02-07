package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account2;
import exception.ex.model.excepetions.AccountException;

public class ApplicationtAccount {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner =  new Scanner(System.in);
	
		
		try {
		System.out.println("Enter account data");
		
		System.out.print("Number: ");
		Integer number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Holder: ");
		String holder = scanner.nextLine();
		
		System.out.print("Inicital balance: ");
		Double initialBalance = scanner.nextDouble();
		
		System.out.print("Withraw limit: ");
		Double withrawLimit = scanner.nextDouble();
		
		Account2 account2 = new Account2(number, holder, initialBalance, withrawLimit);
		
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double  amountWithdraw = scanner.nextDouble();
		
		
			account2.withdraw(amountWithdraw);
			System.out.println("New balance: " + account2.getBalance());
			
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("With error: " + e.getMessage());
		} catch (InputMismatchException e) {
		
			System.out.println("Error : digit a number" + e.getMessage());
			e.getStackTrace();
		
		}
		
		System.out.println("fim-");
		
	}
	
		
		
	
}
