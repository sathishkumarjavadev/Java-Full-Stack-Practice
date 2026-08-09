package p013_File_Handling.FH_03_FileReader;

import java.io.FileReader;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		FileReader frobj = new FileReader("employee.txt");
		int data;

        while ((data = frobj.read()) != -1) {
            System.out.print((char) data);
        }

        frobj.close();
	}
	
}