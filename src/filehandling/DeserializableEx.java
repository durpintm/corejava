package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableEx {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream io= new ObjectInputStream(new FileInputStream(new File("D:\\java course\\user.txt")));
		User user = (User) io.readObject();
		io.close();
		System.out.println(user);
		
	}

}
