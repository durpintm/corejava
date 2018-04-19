		package filehandling;
		
		import java.io.File;
		
		public class FileExample {
		public static void main(String[] args) {
				 File file= new File("D:\\java course\\wers1.txt");
				  boolean isdirectory = file.isDirectory();
				  System.out.println("wers1.txt is a directory: "+ isdirectory);
				  boolean isfileExists = file.exists();
				  System.out.println("file exists: "+isfileExists);
				  File fdir = new File("D:\\java course\\javatraining");
				  boolean dircreated = fdir.mkdir();
			  if(dircreated){
				  System.out.println("java training is successfully created!!");
			  }
			  String [] filenames= fdir.list();
			  for (String filename:filenames) {
				System.out.println(filename);
			
			}
			  
			  File [] files= fdir.listFiles();
			  for(File file2:files){
				  System.out.println(file2.getAbsolutePath()+" "+ file2.isDirectory());
			  }
					  
		}
		}
