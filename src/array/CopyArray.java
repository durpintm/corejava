package array;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		
	char from[]={'n','e','p','a','l','k','t','m'};
char to[]= new char[5];
System.arraycopy(from, 3, to, 0, 5);
Arrays.sort(to);
System.out.println(to);

	}
	
}
