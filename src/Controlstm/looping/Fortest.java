package Controlstm.looping;

public class Fortest {
public static void main(String[] args) {
	int a=1, b=4;
	for (;a<b; a++,b--) {
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	int sum = 0;
	for (int i = 0; i <=100 ; i++) {
		if (i%2==0 ) {
			
			sum+=i;
			
		} 
		
	}
	System.out.println(sum);
}
}
