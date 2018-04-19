package java_core;

public class Variables { 
	/*
}
	byte (number, 1 byte)
	short (number, 2 bytes)
	int (number, 4 bytes)
	long (number, 8 bytes)
	float (float number, 4 bytes)
	double (float number, 8 bytes)
	char (a character, 2 bytes)
	boolean (true or false, 1 byte)*/
	public static void main(String[] args) {
		
	int my_int = 10;
	int num= 10_00_00_000;
	long my_long=1334854479483l;
	float my_float = (float) 6.7;/* 6.7f also works    */
	double my_double = 111.77;
	char my_char = 'A';
	byte b=127;
	boolean my_bool = true;
	
	System.out.println("Int: "+my_int);
	System.out.println("Integer: "+Integer.SIZE+"  "+Integer.MIN_VALUE+"  "+Integer.MAX_VALUE);
	System.out.println("Number: "+num);
	System.out.println("Long: "+my_long);
	System.out.println("Long: "+Long.SIZE+"  "+Long.MIN_VALUE+"  "+Long.MAX_VALUE);
	System.out.println("Float: "+my_float);
	System.out.println("Float: "+Float.SIZE+"  "+Float.MIN_VALUE+"  "+Float.MAX_VALUE);
	System.out.println("Double: "+my_double);
	System.out.println("Double: "+Double.SIZE+"  "+Double.MIN_VALUE+"  "+Double.MAX_VALUE);
	System.out.println("Character: "+my_char);
	System.out.println("character size:"+Character.SIZE);
	System.out.println("Boolean: "+my_bool);
	System.out.println("Byte: "+Byte.SIZE+"  "+Byte.MIN_VALUE+"  "+Byte.MAX_VALUE);
	System.out.println("Short: "+Short.SIZE+"  "+Short.MIN_VALUE+"  "+Short.MAX_VALUE);



	}

}
