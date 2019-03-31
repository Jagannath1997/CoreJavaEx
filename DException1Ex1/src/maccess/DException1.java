package maccess;

import java.util.InputMismatchException;
import java.util.Scanner;
//this class demo for Simple Exception Handling
public class DException1 {

	public static void main(String[] args) {

		xyz://level for while loop 
		while (true) {
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the val:");
				int val = s.nextInt();

				int z = 44 / val;//exception will be raised
				
				System.out.println("The Val of z:" + z);
				s.close();
				break xyz;
			} catch (ArithmeticException ae) {
				System.out.println("only non zero value..");
				System.out.println("details: " + ae.getMessage());
			} catch (InputMismatchException ime) {
				System.out.println("Only integer value..");
				System.out.println("Details: " + ime.getMessage());
			}
		} // while close
	}
}
