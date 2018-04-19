package control_stm;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String args[]) {
		  int a = 80, b = 30;

		  if (b > a) {
		   System.out.println("b is greater");
		  } else {
		   System.out.println("a is greater");
		  }
		  
		  
		//  int n=65;
		  System.out.println("enter a number: ");
		  Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		  if (n%2==0) {
			   System.out.println("n is even");
			  } else {
			   System.out.println("n is odd");
			  }
		  
		 }
}
