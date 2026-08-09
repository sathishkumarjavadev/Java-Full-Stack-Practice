package p013_File_Handling.FH_11_CharacterStream_Read;
import java.io.FileReader;
public class Main {
	public static void main(String[] args) throws Exception {
        FileReader frobj = new FileReader("character_data.txt");
        int data;
        while ((data = frobj.read()) != -1) {
            System.out.print((char) data);
        }
        frobj.close();
        System.out.println("\nFile reading completed");
	}
}

/*
 * |                 | Byte Stream        | Character Stream        |
| --------------- | ------------------ | ----------------------- |
| Data            | Bytes              | Characters              |
| Write           | `FileOutputStream` | `FileWriter`            |
| Read            | `FileInputStream`  | `FileReader`            |
| Best suited for | Binary data        | Text data               |
| Examples        | Images, PDF, audio | `.txt`, `.java`, `.csv` |


                    FILE HANDLING
                         │
          ┌──────────────┴──────────────┐
          │                             │
     BYTE STREAMS                 CHARACTER STREAMS
          │                             │
    Input / Output                 Reader / Writer
          │                             │
 FileInputStream               FileReader
 FileOutputStream              FileWriter
 
 
 
 BufferedReader
       ↓
works with Reader

BufferedWriter
       ↓
works with Writer


*/
 