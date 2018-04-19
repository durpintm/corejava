package java_core;

public class OperatorTest {
public static void main(String[] args) {
	int x=10;
	System.out.println(x++);
	System.out.println(x+5);
	
	System.out.println(++x);
	System.out.println(x++ + ++x);
	
	//shift operator
	int a=200;
	System.out.println(a<<2);/*  a*2*2 */
	System.out.println(a<<5);/* a*2*2*2*2*2  */
	System.out.println(a>>2);//a/(2*2)
	
	//ternary operator
	int k,b=40,s=60;
	k = s > b ? s : b;
	
	
	
	System.out.println("the largest number is:"+k);

}
}
