
public class hello {

	   public static void main(String [] args)
	   {
		   String var = "Hello World \u002B";
		   //002B is unicode for + symbol 
		   System.out.println(var);
		   
		   //concatenating
		   int var1 = 10;
		   String var2 = "20";
		   String var3 = "30";
		   System.out.println(var1+var2);
		   //output 1020 --> 10 which is of int type is type casted and converted into string
		   System.out.println(var2+var3);  //output 2030
		   System.out.println(var1 + 20 +"hi");
		   //output becomes 30hi
		   
		   //proper way of declaring a String 
		   String var5 = new String ("Proper Way!");
		   System.out.println(var5);
	   }
}

