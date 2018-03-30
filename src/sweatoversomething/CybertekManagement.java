package sweatoversomething;

import java.io.IOException;

public class CybertekManagement {

	String studentName;
	String [] students=new String[60];
	
	int index=0;
	
	public void addStudent() {
		
		students[index]=studentName;
		index++;
		System.out.println(index);
		
	}
	
	public void printAllStudents() {
		System.out.println("\n Todays students");
		
		for (int index=0; index<60; index++) {
			
			if (students[index]==null) {
				continue;
				
			}
			System.out.println(students[index]);
			
		}
	}
	
	static int someInt = 10;
	  public static void changeIt(int a){
	    a = 20;
	  }
	  
	  public int base;
	    public int height;
	    private final double ANGLE;

	    public  void setAngle(double a){  ANGLE = a;  }
	
	public static void main(String[] args) {  
		changeIt(someInt);
		 CybertekManagement t = new CybertekManagement();
	        t.setAngle(90);
	
         }

		
	
	}
	
	  int someMethod(String str) throws IOException{
	      if(str == null) throw new IOException();
	      else return str.length();
	   }

	
}
