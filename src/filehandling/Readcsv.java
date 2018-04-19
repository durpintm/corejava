package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Readcsv {
 public static void main(String[] args) {
	BufferedReader br= null;
	try {
		br= new BufferedReader(new FileReader("D:\\java course\\demo.csv"));
		String row;
		while((row=br.readLine())!= null){
			String [] cols= row.split(",");
			if(cols[0].equals("s.n.")){
				continue;
			}
			
			//databaseconnection
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			String sql= "insert into dbdemo(name,email,contact,address) values(?,?,?,?)";
			PreparedStatement pstm= con.prepareStatement(sql);
			pstm.setString(1,cols[1]);
			pstm.setString(2,cols[2]);
			pstm.setString(3,cols[3]);
			pstm.setString(4,cols[4]);
			pstm.execute();

			if(pstm.execute()==true){
				System.out.println("successfully updated!!");
			}
		     
			
		//	System.out.println(cols[0]+"\t"+cols[1]+"\t"+cols[2]+"\t"+cols[3]+"\t"+cols[4]);
			
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}finally {
		if(br!=null){
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	}
 
}

