package selfTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.util.Sc;

public class HasNextLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		int i =1;
		String string;
		try {
			
			inputStream = new Scanner(new FileInputStream("resource\\BladeRunner.txt"));
			outputStream = new PrintWriter(new FileOutputStream("resource\\NumberedRunner.txt"));
			
			while(inputStream.hasNextLine())
			{
				string = inputStream.nextLine();
				
				outputStream.println( (i++) +" "+string);
				
			}
			
			
			/* your code */
			/* Input File Location Example: resource\\BladeRunner.txt */
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files.");
			System.exit(0);
		}
		
		/* your code */
	
		outputStream.close();
	}

}
