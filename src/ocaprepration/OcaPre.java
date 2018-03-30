package ocaprepration;

public class OcaPre {
	
	//int i[4] = { 1, 2, 3, 4 } ;
	
	//int i[ ] = new int[2] {1, 2} ;
	
	//int i[ ][ ] = { { 1, 2 }, new int[ 2 ] } ;
	
	static int age=10; 

public static void setAge() {
	
	System.out.println("Static touching the null");
}

public void getAge() {
	
	System.out.println(age);
}

	
public static void main(String[] args) {
	char n='a'; 
	
	OcaPre kk=new OcaPre(); 
	
	kk=null; 
	

	  String s = "hello";
      StringBuilder sb = new StringBuilder( "hello" );
      
   
      if( s == sb.toString() )  System.out.println( "Equal" );
      else System.out.println( "Not Equal" );
      
      int x = 0;
      switch(x){
      }
      
      boolean b1 = false;
      int i1 = 2;
      int i2 = 3;
      if (b1 = i1 == i2){
         System.out.println("true");
      } else{
         System.out.println("false");
      }
  
      System.out.println(1 + 5 < 3 + 7);
      
      
      boolean flag  = false;
    

      
      Integer nmb=Integer.parseInt("113");
      
      int nmb1=Integer.valueOf("113").intValue();  
      short shrt=new Short((short)1); 
     int nmb2=new Integer(1); 
     
     char ch=new Character('c'); 
     
     int nn=ch; 
     
     byte bb= (byte) ch;
     
     char cc=14; 
     
     int in='c'; 
      
      System.out.println(nmb);
      System.out.println(nmb1);
      
      System.out.println(nmb==nmb1);
      
      System.out.println(nmb.equals(nmb1));
}

}