package p013_File_Handling.FH_05_Delete;

import java.io.File;

public class Main {
	
	public static void main(String[] args) throws Exception 
	{
		 File file = new File("employee.txt");

	        if (file.exists()) {

	            if (file.delete()) {
	                System.out.println("File deletedx successfully");
	            } else {
	                System.out.println("Failed to delete file");
	            }

	        } else {
	            System.out.println("File not found");
	        }
	}

}
