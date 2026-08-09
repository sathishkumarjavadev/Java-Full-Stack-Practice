package p013_File_Handling.FH_01_Basic;

import java.io.File;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("employee.txt");//does not create the actual file. It only creates a Java File object representing that path.
		
		System.out.println(file);
		
		System.out.println(file.exists());//checks whether the file is present or not 
		System.out.println("File name : " + file.getName());
		System.out.println("File path : " + file.getAbsolutePath());
		System.out.println("Can read : " + file.canRead());
		System.out.println("Can write : " + file.canWrite());
		System.out.println("File size : " + file.length());
		System.out.println("File Execute : " + file.canExecute());
	
		if (file.createNewFile()) {
			System.out.println("file created successfully");
		}
		else {
			System.out.println("file already exist");
		}
	}
}