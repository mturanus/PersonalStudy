package sweatoversomething;

public class ReplaceB {
	
	public static void main(String[] args) {
		
		String words[] ={"Bananas", "Blueberries", 
				"Cherries", "Broccoli", 
				"Butternut Squash", "Green bean", "Peanut"}; 
		
		for (int n=0; n<words.length;n++) {
			
			words[n]=words[n].replaceFirst("B", "V");
			
			words[n]=words[n].replaceFirst("b", "v");
			
			

			
		}
		
		for(String name:words) {
			
			System.out.println(name);
		}
		
	}

}
