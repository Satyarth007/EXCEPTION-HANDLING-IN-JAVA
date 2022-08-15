
public class methodsToPrintExceptionMessageInJava {

	public static void main(String[] args) {
		// There are 3 methods to print exception message in JAVA.
		/* 
		   1. printStackTrace(); ----
		         name + description + location
		   2. toString(); ----
		         name + description  
		   3. getMessage(); ----
		         description 
		         
		
       */
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("====================================================================");
			System.out.println(e.toString());
			System.out.println("====================================================================");
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
