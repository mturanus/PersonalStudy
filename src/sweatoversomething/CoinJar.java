package sweatoversomething;

public class CoinJar {
	
	public static void main(String[] args) {
		
		int[] CoinsJar = { 10, 10, 25, 25, 5, 5, 5, 25, 10 };

		int quarters, dimes, nickels;
		quarters = dimes = nickels = 0;
		
		for(int coin: CoinsJar) {
			
			
			switch(coin) {
			
			case 25: 
				
				quarters++;
				
				break;
				
			case 10:
				
				dimes++;
				
				break;
				
			case 5: 
				
				nickels++;
					
					break;
				
				default:
					
					System.out.println("not a quarter or dime or nickel");
					break;
					
			}
			
		}
		
		System.out.println(quarters*25);
		
		System.out.println(dimes*10);
		
		System.out.println(nickels*5);
		
		
		
		
	}

}
