package java_core;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter some String : ");
		String user_input_string = sc.nextLine();
		System.out.println("Enter some Number : ");
		long user_input_Long =sc.nextLong();
		System.out.println("\nThe entered String is");
		System.out.print(user_input_string);
		System.out.println("\nThe entered Number is");
		System.out.println(user_input_Long);
		
		System.out.print ("Enter first int: ");
		 
		while (sc.hasNextInt())
		 
		{
		 
		int i = sc.nextInt();
		 
		System.out.println("You entered " + i);
		 
		System.out.print ("Enter another int: ");
		 
		}
	}

}
