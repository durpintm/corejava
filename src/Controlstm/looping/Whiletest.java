package Controlstm.looping;

import java.util.Scanner;

public class Whiletest {
	public static void main(String[] args) {
		int i=1;
		while(i<=20){
			System.out.println(i+" "+i*i+" "+i*i*i);
			i++;
		}
		System.out.println();
		System.out.println();
		
		int a=35;
		int b=49;
		while(a<=b){
			System.out.println(a+" "+a*a+" "+a*a*a);
			a++;
		}
		
		
		int k,m;
		Scanner sc= new Scanner(System.in);	
		System.out.println("enter first number:");
		k=sc.nextInt();
		System.out.println("enter first number:");
		m=sc.nextInt();
		while(k<=m){
			System.out.println(k+" "+k*k+" "+k*k*k);
			k++;
		}
		
	}

}
