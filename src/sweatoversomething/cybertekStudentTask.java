package sweatoversomething;

import java.util.*;

public class cybertekStudentTask {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
			
			boolean lastStudent=false;
			
			CybertekManagement cm=new CybertekManagement();
			
			while(!lastStudent) {
				System.out.println("What is your name");
				cm.studentName=scan.nextLine();
				cm.addStudent();
				
				System.out.println("Are you last student? Yes/No");
				String answer=scan.nextLine();
				
				
				if (answer.equals("yes")) {
					lastStudent=true;
					
				}
				else {
					lastStudent=false;
					
				}
			}
			cm.printAllStudents();
			
		}
		
		
	}

