package sweatoversomething;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception {
	
	
	public Exception() {
		
		System.out.println(this);
	}
	public void throwException() throws FileNotFoundException {
		
		throw new FileNotFoundException(); 
	}
	
	public  void setAge() throws IOException{
		
		//throwException();
		
		
	}
	public  String getM(int i ) throws IOException{
		
		if(i<0) {
			
			try {
				//throw new FileNotFoundException(); 
				throwException();
				setAge(); 
				
				//return "try block"; 
			}catch(FileNotFoundException e) {
				
				System.out.println("file not found");
				
				//return "File not found";
			}catch(IOException e) {
				
				System.out.println("General catch");
			//	return "general";
				
			}finally {
				System.out.println("Finally");
				
			//	return "finally";
				
			}
			
			return "fanatik";
			
		}
		
		return "without if";
	}
	
	String s="a"; 
	
	
	public static void main(String[] args) throws IOException {
		Exception exp=new Exception(); 
		
		
		exp.getM(-1); 
		
		exp.setAge();
		
		
		
		try {
			exp.throwException();
			
		} catch (IOException e) {
			// TODO: handle exception
			
			System.out.println("file not found exception");
			
			
		}
		
		Exception e =null;
	      throw e;
System.out.println(4+1.0f);
	
	}

}
