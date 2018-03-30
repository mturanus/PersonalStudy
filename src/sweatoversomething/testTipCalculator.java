package sweatoversomething;

import java.util.*;

public class testTipCalculator {
public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Split: " );
		
		boolean correct=true;
		String result=correct ? "Yes":"No";
		
		result=input.next();
		
		System.out.println("Number of people: ");
		
		int numPeople=input.nextInt();
		
		System.out.println("Check Amount: ");
		
		int checkAmount=input.nextInt();
		
		tipCalculator run=new tipCalculator();
		
		
		System.out.println("Service Quality: ");
		
		String serviceQuality=input.next();
		
		run.getTip(numPeople, checkAmount, serviceQuality, result);
	}


}
