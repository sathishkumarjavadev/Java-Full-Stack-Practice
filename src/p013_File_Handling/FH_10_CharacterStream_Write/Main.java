package p013_File_Handling.FH_10_CharacterStream_Write;
import java.io.FileWriter;
public class Main {
	public static void main(String[] args) throws Exception {
        FileWriter fwobj = new FileWriter("character_data.txt");
        fwobj.write("Hello Java Character Stream");
        fwobj.close();
        System.out.println("Data written successfully");
    }
}