import java.math.BigDecimal;

public class hello {

	public static void main(String[] args) {
		
		/*
		double x1 =1.05;
		double x2= 2.55;
		System.out.println(x1+x2);  //output comes 3.5999999999999996 
		//this id due to java's automatic roundoff feature 
		*/
		
		
		//so we will use BigDecimal class 
		/*
		BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(2.55);
		//output should be 3.6
		System.out.println(d1.add(d2));
  //output comes as 3.5999999999999998667732370449812151491641998291015625
	
	*/
		
		//convert the int into strings 
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		//output should be 3.6
		System.out.println(d1.add(d2));
		//output is 3.60 hence issue fixed 
	}

}
