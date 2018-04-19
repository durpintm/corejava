package array;

public class Arrayaddition {
	
	public static void main(String[] args) {
		int mat1[][]={{4,6},{7,8}};
		int mat2[][]={{7,2},{9,12}};
		int mat3[][]=new int[2][2];
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				
				
				mat3[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(mat3[i][j]+" ");
				
			}
			System.out.println();
		}


	}

}
