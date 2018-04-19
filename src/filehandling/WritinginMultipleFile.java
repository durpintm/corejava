package filehandling;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritinginMultipleFile {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream f1=new FileOutputStream("D:\\java course\\1mul.txt");
		FileOutputStream f2= new FileOutputStream("D:\\java course\\2mul.txt");
		ByteArrayOutputStream bt= new ByteArrayOutputStream();
		bt.write(12);
		bt.writeTo(f1);
		bt.writeTo(f2);
		bt.close();
		bt.flush();
				
	}

}
