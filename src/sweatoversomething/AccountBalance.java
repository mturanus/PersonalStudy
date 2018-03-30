package sweatoversomething;

import java.util.Scanner;

public class AccountBalance {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial balance:");
		
		int counter=0;
		
		double balance=input.nextDouble();
		
		do {
			
			System.out.println("make a purchase: ");
			
			double transactionAmount=input.nextDouble();
			
			if (transactionAmount>balance) {
				
				System.out.println("transaction declined ");
				
				break;
			}
			
			balance-=transactionAmount;
			counter++;
			
		}while (balance>0);
		
		System.out.println("you are out of money");
		System.out.println("your balance is "+balance);
		System.out.println("transactions count is "+counter);
		
		
	}

}
