package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("D:\\java course\\was.txt");
	int i;
	while((i=fr.read())!=-1){
		
		System.out.print((char )i);
		
	}
	fr.close();
}
}
