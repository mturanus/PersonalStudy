package fakeituntilmakeit;

import java.util.*;

public class creatingArray {
	
	public static void main(String[] args) {
		
		int [] numbers= new int[4];
		
		int numberss[] = new int [4]; 
		
		int [] num= new int [] {4,5,6};
		
		int [] numb = {45,243,62, 13, 345}; 
		
		int n1=62; 
		
		numbers[0]= 2;
		numbers[1]= 5; 
		
		numbers[2]= 6; 
		
		Arrays.sort(numb);
		
		System.out.println(Arrays.binarySearch(numb, n1));
		
		
		
		for(int n: numb) {
			
			System.out.println(n);
		}
		
		
		
	}
	
	public int addNumbers(int... number13) {
		return 0;
		
		
	}

}
