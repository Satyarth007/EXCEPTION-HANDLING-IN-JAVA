
public class tryCatchFinallyDemo {

	public static void main(String[] args) {
		// ORDER IS MANDOTRY IN 'try-catch-finally' BLOCK
//==============================================================================================		
		// THIS IS VALID
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("end");
		}
//==============================================================================================		
		
		// THIS IS INVALID 
/* 
 
		 try {
			System.out.println(10/0);
		}
		
		finally {
			System.out.println("end");
		}
		catch(ArithmeticException e) {         // C.E. :- catch without try
			System.out.println(e);
		}
		  
*/

	}

}
