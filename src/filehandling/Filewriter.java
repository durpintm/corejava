package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\java course\\was.txt",true);
			fw.write("java developers of nepal!!");
		fw.write("java developers of nepal!!\n");
		fw.close();
		System.out.println();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the information is added in the file!!");
		
	}

}
