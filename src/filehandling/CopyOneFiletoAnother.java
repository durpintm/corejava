package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyOneFiletoAnother {
	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("D:\\java course\\txt3.txt");
		FileWriter fw = new FileWriter("D:\\java course\\werscopy.txt");
		int i;
		while((i=fr.read())!=-1){
			fw.write(i);
		}
		fr.close();
		fw.close();
		System.out.println("successfully copied!!!");
		
		
	}

}
