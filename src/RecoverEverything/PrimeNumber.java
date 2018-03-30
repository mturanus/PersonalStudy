package RecoverEverything;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		
		int num=input.nextInt();
		
		boolean prime=true;
		
		if(num<1) {
			
			System.out.println("not prime");
		}else if (num%2==2&&num!=2) {
			
			System.out.println("not prime");
			
		}else {
			
			for(int div=2; div<num; div++) {
				
				if(num%div==0) {
					
					prime=false;
					break;
				}
			}
			
			if(prime) {
				
				System.out.println("prime number");
			}else {
				
				System.out.println("not a prime number");
			}
		}
		
		
	}

}
