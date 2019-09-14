package selfTest;

//Import the library for using Scanner class
import java.util.Scanner;

@SuppressWarnings("unused")
public class Project02_1 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		// Generate the Scanner class

		int n = 0;
		
		
		
		System.out.print("Enter the number: ");
		n= scan.nextInt();
		
		if(n <0) {
			System.out.print("N is less than 0");
		}	
		else if(n >=0 && n <100) {
				System.out.print("n is greater than or equal to 0 and less than 100");
				
			}
		else
		{
			System.out.print("n is greater than or equal to 100");		
		}
	}

}
