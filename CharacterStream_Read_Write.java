//12. Write a Java program to demonstrate CharacterStream to read from and write to a file.

package POE_Questions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream_Read_Write {

	public static void main(String[] args) throws IOException {

		String str = "File Handling in Java using FileWriter and FileReader";
		FileWriter fw = new FileWriter("d://output.txt");
		for (int i = 0; i < str.length(); i++)
			fw.write(str.charAt(i));

		System.out.println("Writing successful");
		fw.close();

		int ch;
		FileReader fr = null;
		try {
			fr = new FileReader("d://output.txt");
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}
		while ((ch = fr.read()) != -1)
			System.out.print((char) ch);	
	}
}
