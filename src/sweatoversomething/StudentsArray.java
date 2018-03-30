package sweatoversomething;

import java.net.SocketTimeoutException;

public class StudentsArray {
	
	public static void main(String[] args) {
		
		String[] students = {"Muhammadjon","Dana","Claci","Cristos"};
		
		for(int i=0; i<students.length; i++) {
			
			System.out.println(students[i] );
		}
		
		for(String n: students) {
			
			System.out.println(n);
		}
		
		int[] nums = {10,100,20,200,300};
		
		for(int n=0; n<nums.length; n+=2) {
			
			System.out.println(nums[n]);
		}
		
		for(int num: nums) {
			
			System.out.println(num);
		}
		
	}
	
	

}
