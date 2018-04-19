package Controlstm.looping;

public class Typecast {
	
	/*
	 * syntax
	 * datatype var= (datatype) value;
	 * 
	 * implicit:
	 * byte->short->int->long->float->double
	 * 
	 * explicit:
	 *double->float->long->int->short->byte
	 * 
	 * */
	
	public static void main(String[] args) {
		
		byte b=123; 
		short s=b;//(short)b->optional
		int it=s;
		long l= it;
		float f=l;
		double d = f;
		
		double db=45445565.6565656;
		float ft=(float) db;
		long ld=(long)db;
		int i=(int)db;
		short sh= (short)db;
		byte by= (byte)db;
		System.out.println(ft);
	}

}
