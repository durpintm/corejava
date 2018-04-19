package Controlstm.looping;

public class Jumptest {
	
	//break;
	//continue;
	//return;
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			if (i==5) {
				//continue;
				//break;
				return;
			}
			System.out.println(i);
			
		}
		System.out.println("after for loop!!");
	}

}
