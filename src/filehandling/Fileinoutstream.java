package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinoutstream {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin = new FileInputStream("D:\\java course\\asd.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ((i=bin.read())!=-1) {
				System.out.print((char)i);
				
			}
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
