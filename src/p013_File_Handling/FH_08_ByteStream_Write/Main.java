package p013_File_Handling.FH_08_ByteStream_Write;

import java.io.FileOutputStream;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		FileOutputStream fosobj = new FileOutputStream("byte_data.txt");
		String data = "Hello java byte stream";
		byte[] bytes = data.getBytes();
		fosobj.write(bytes);
		fosobj.close();
		System.out.println("Data Written successfully");
	}
}
