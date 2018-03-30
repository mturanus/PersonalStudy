package RecoverEverything;

import java.util.*;

public class ReadUnreadMessages {
	
	public static void main(String[]args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many unread messages :");
		int unread = input.nextInt();
		System.out.println("How many read messages :");
		int read = input.nextInt();
		
		
		for(int i=unread; unread>=0; unread--) {
			
			System.out.println(unread);
			System.out.println(read);
			
			read++;
		}
		
		
		
		
	}

}
