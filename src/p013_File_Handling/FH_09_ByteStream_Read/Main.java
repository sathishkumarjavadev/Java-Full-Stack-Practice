package p013_File_Handling.FH_09_ByteStream_Read;

import java.io.FileInputStream;

public class Main {
	
	public static void main(String[] args) throws Exception{
		FileInputStream fisobj = new FileInputStream("byte_data.txt");
		int data;
		while((data = fisobj.read())!=-1)
		{
			System.out.println((char)data);
		}
		fisobj.close();
		System.out.println("\nFile reading completed");
		}
	}
