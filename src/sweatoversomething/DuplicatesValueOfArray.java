package sweatoversomething;

import java.util.List;

public class DuplicatesValueOfArray {

	
	
	public static void main(String[] args) {
		int [] duplicate1= {1,2,34,5};
		
		boolean res=hasDuplicates(duplicate1);
		
		System.out.println(res);
	}
	
	public static boolean hasDuplicates(int [] nums) {
		
		if(nums.length<=1)return false; 
		
		for(int i =0; i<nums.length; i++) {
			
			for(int k=i+1; k<nums.length;k++) {
				
				if(nums[i]==nums[k]) {
					
					return true; 
				}
			}
		}
		return false;
	}
	
	
	
public static boolean hasDuplicats(List<Integer> nums) {
		
		if(nums.size()<=1)return false; 
		
		for(int i =0; i<nums.size(); i++) {
			
			for(int k=i+1; k<nums.size();k++) { 
				
				if(nums.get(i)==nums.get(k)) {
					
					return true; 
				}
			}
		}
		return false;
	}

}
