package sweatoversomething;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		for (int n=1; n<=10; n++) {
			
			if (n==1 && n==4 &&n==5) {
				
				continue;
			
			}
			
			for(int j=1; j<=10; j++) {
				
				System.out.println(n+"*"+j+"="+(n*j));
				
				
			}
		}
		
		
	}

}
