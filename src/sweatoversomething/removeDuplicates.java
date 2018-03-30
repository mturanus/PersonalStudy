package sweatoversomething;

public class removeDuplicates {
	
	public static void main(String[] args) {
		
		StringBuilder noDupes=new StringBuilder();
		String mixed; 
		
		mixed="kkasdfauuasdfsdd111222";
	
		for(int i=0; i<mixed.length();i++) {
			String si=mixed.substring(i, i+1);
			if(noDupes.indexOf(si)==-1) {
				noDupes.append(si);
				
				
			}
		}
		
		System.out.println(noDupes.toString());
		
		
		String result = new String("");

	    for (int i = 0; i < mixed.length(); i++) {
	        if (!result.contains("" + mixed.charAt(i))) {
	            result += "" + mixed.charAt(i);
	        }
	    }

	    System.out.println(result);
	    
	    String a; 
	    
	    String b; 
	    
	    a="Hello";
	    b="oscar";
	    
StringBuilder n=new StringBuilder();
		
		
		if(a.charAt(a.length()-1)==b.charAt(0)) {
			
			a.replace(a.substring(a.length()-2,a.length()-1), " ");
			
		System.out.println(a);
		}
		
		System.out.println(n.append(a).append(b).toString());
		
	}

}
