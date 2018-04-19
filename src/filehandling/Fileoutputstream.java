package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstream {
	public static void main(String[] args) {
		try {
			FileOutputStream fout;
			fout = new FileOutputStream("D:\\java course\\asd.txt");

			String str="java developers of nepal";
			byte[] b =str.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("the information is added in the file!!");

		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();

	}

	}
	}
