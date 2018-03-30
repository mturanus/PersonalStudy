package sweatoversomething;

import java.util.*;

public class PrintNTimes {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = input.next();
		
		System.out.println("How many times:");
		int count = input.nextInt();
		
		String accumulator="";
		
		for(int i=1; i <=count; i++) {
			
			accumulator+=str; 
			
		}
		System.out.println(accumulator);
	}

}
