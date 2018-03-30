package sweatoversomething;

public class tipCalculator {
	double totalAmount ;
	double finalAmount;
	double tipAmount;
	double tipPerson;
	
	
	public void getTip(int numberPeople, double amount, String quality, String split) {
		
		
		
		switch (quality) {
		
		case "Poor":
			tipAmount=amount*5/100;
			totalAmount=amount + tipAmount;
			System.out.println("Total to pay: "+totalAmount);
			System.out.println("Total Tip: "+tipAmount);
			
			break;
			
		case "Fair":
			tipAmount=amount*10/100;
			totalAmount=amount + tipAmount;
			System.out.println("Total to pay: "+totalAmount);
			System.out.println("Total Tip: "+tipAmount);
			
			break;
			
		case "Good":
			tipAmount=amount*15/100;
			totalAmount=amount + tipAmount;
			System.out.println("Total to pay: "+totalAmount);
			System.out.println("Total Tip: "+tipAmount);
			
			break;
		case "Great":
			tipAmount=amount*20/100;
			totalAmount=amount + tipAmount;
			System.out.println("Total to pay: "+totalAmount);
			System.out.println("Total Tip: "+tipAmount);
			
			break;
			
		case "Excellent":
			tipAmount=amount*25/100;
			totalAmount=amount + tipAmount;
			System.out.println("Total to pay: "+totalAmount);
			System.out.println("Total Tip: "+tipAmount);
			
			break;
			
		}
		
		
			if(split.endsWith("Yes")) {
				
				System.out.println("Split");
				finalAmount=totalAmount/numberPeople;
				
				System.out.println("Total per person: "+finalAmount);
				tipPerson=tipAmount/numberPeople;
				
				System.out.println("Tip per person: "+tipPerson);
				
			} else {
				System.out.println("no Split");
				finalAmount=totalAmount;
				
				System.out.println("Total to Pay: "+finalAmount);
				
			}
			
		
			
			
		
		
	}

}
