//14. Write a Java program to demonstrate reading from and writing to a Data Stream.
package POE_Questions;

import java.io.*;

public class DataStream_Read_Write {
	 public static void main(String[] args) throws IOException {  
		   try { InputStream input = new FileInputStream("D://textout.txt");  
		    DataInputStream inst = new DataInputStream(input);  
		    int count = input.available();  
		    byte[] ary = new byte[count];  
		    inst.read(ary);  
		    for (byte bt : ary) {  
		      char k = (char) bt;  
		      System.out.print(k);  
		    } }
		   catch(FileNotFoundException e) {
			   System.out.println(e);
		   }
		  }  
		}  