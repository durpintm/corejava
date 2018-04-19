package array;

import java.util.Scanner;

public class MultiDaarry {
	/*
	 * syntax:
	 * 
	 * datatype arrname[][]=new datatype[row-size][column-size];
	 * 
	 * */
	public static void main(String[] args) {
		
		int mat1[][]= new int[2][2];
//		mat1[0][0]=23;
//		mat1[0][1]=33;
//		mat1[1][0]=43;
//		mat1[1][1]=53;
		
		Scanner sc= new Scanner(System.in);
		
		
		for (int i = 0; i < mat1.length; i++) {
			
			for (int j = 0; j < mat1.length; j++) {
				System.out.println("enter value for matrix: ");
				mat1[i][j]= sc.nextInt();
				
			
			//System.out.print(mat1[i][j]+"  ");
			}

		}
for (int i = 0; i < mat1.length; i++) {
			
			for (int j = 0; j < mat1.length; j++) {
				
				
			
			System.out.print(mat1[i][j]+"  ");
			}
			System.out.println();

		}
		
	}

}
