package RecoverEverything;

import java.util.*;

public class PrintNTimes {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = input.next();
		
		System.out.println("How many times:");
		int count = input.nextInt();
		
		String accumulator="";
		
		for(int i=1; i<=count; i++) {
			System.out.println(accumulator);
			
			accumulator+=str; 
			
		}
		
		
		
		String accumulator1="";
		
		for(int n=count; n>=1; n--) {
			
			System.out.println(accumulator1);
			
			accumulator1+=str; 
			
			//accumulator1-=str; 
			
		}
	
	}

}
