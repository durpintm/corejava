package Controlstm.looping;

public class Foreach {
public static void main(String[] args) {
	 int data[]= {4,5,6,8,5,4,7};
	 int sum=0;
	 for (int i : data) {
		
		 sum+=i;
		 System.out.println(i);
		 
	}
	 System.out.println("the total is: "+ sum);
}
}
