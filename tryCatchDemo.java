
public class tryCatchDemo {

	public static void main(String[] args) {
		// Learning try-catch block
		 System.out.println("START");
		 try {
			 System.out.println(10/0);
		 }
		 catch(Exception e) {
			 System.out.println("Arithmetic Exception Handled here.");
		 }
		 System.out.println("END");

	}

}
