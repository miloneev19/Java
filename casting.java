package Udemy;

public class casting {

	public static void main(String[] args) {
		//implicit typecasting 
		/*
         short x1 =5;
         int x2 =x1 ;
         System.out.println(x2);
         */
		
		//implicit typecasting not possible in below 
		/* int x1 =5;
         short x2 =x1 ;  //generates error in this line 
         System.out.println(x2);
         */
		
		//explicit 
		 int x1 =5;
         short x2 =(short)x1 ;
         System.out.println(x2);
         
         int x3 =5;
         short x4 =(byte)x3 ;  //since short can store byte 
         System.out.println(x4);
         
         //during double to float conversion some info is truncated(removed) by java 
	     double d1= 2.012345678d;
	     float f1 = (float)d1;
	     System.out.println(f1);
	     
	     //string to int yields error 
	     /*
	      String s= "10";
	      int x6= (int) s; //not compatible
	      */
	}

}
