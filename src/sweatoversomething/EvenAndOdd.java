package sweatoversomething;
import java.util.Scanner;

public class EvenAndOdd {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter first number: ");
		
		int number1=input.nextInt();
		
		System.out.println("please enter second number;");
		
		int number2=input.nextInt();
		
		if (number1 < number2 ) {
			
			for(int i=number1; i<=number2; i++) {
				
				System.out.println(i);
			}
		}else if (number1>number2) {
			
			for (int n=number1; n>=number2; n--) {
				
				System.out.println(n);
			}
		}else {
			
			System.out.println(number1+","+number2);
		}
		
		
	}

}
