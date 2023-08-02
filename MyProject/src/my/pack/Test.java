
package my.pack;
import java.util.Scanner;  

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter First Name:  ");

		    String Name = myObj.nextLine();  // Read user input
		    
		    System.out.println("Enter Last Name:  ");
		    
		    String LName = myObj.nextLine();
		    
		    System.out.println("Your Name is:  " + Name + "" + LName);  // Output user input
  
		
	}

}
