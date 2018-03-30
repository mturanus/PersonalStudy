package sweatoversomething;

import java.util.Scanner;

public class Loops {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		boolean keepAsking=true;
	
		
//		
//		while(keepAsking) {
//			
//			System.out.println("What is your name?");
//			String name=scan.nextLine();
//			
//			System.out.println("Keep asking?");
//			String answer=scan.nextLine();
//			
//			if (answer.equals("yes")); {
//			
//			keepAsking=true;
//			
//			} 
//		
//	}
		
		for (int i =0; i<50; i++) {
			
			if (i%2==0) {
				
				System.out.println(i);
			}
		}
		
		for (int i =0; i<10;i++) {
			if(i==5) {
				
				continue;
				
			}
			System.out.println("i is: "+i);
			
		}
		
		System.out.println("Please enter string");
		
		String word=scan.nextLine();
		int wordSize = word.length();
		
		for (int index=0; index<wordSize; index++) {
			
			if (word.charAt(index)=='a' || word.charAt(index)=='z') {
				
				continue;
				
			}
			System.out.println(word.charAt(index));
			
		}
	}
}
	


