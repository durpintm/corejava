package control_stm;

public class ElseifLadder {
	public static void main(String[] args) {
		int marks=85;
		String division;
		
		if(marks>=80){
			division="distinction";			
		}
		else if(marks>=60){
		division= "first";
			
		}
		else if(marks>=50){
			division="second";
			
		}
		else if(marks>=40){
			division="third";
		}
		else{
			division="failed";
		}
		System.out.println(division);
		
		 int a = 30, b = 30;

	        if (b > a) {
	            System.out.println("b is greater");
	        }
	        else if(a > b){
	            System.out.println("a is greater");
	        }       
	        else {
	            System.out.println("Both are equal");
	        }
			
	}

}
