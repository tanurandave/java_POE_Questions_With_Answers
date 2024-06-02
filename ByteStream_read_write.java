// 11. Write a Java program to demonstrate ByteStream to read from and write to a file.
package POE_Questions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream_read_write {

	public static void main(String[] args) {

		String data = "Hello this is the byte stream read and write";
		String filePath = "d://example.txt";

		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			fos.write(data.getBytes());
			System.out.println("Data written to file successfully.");
		} catch (IOException e) {
			System.out.println(e);
		}

		try{
			FileInputStream fis = new FileInputStream(filePath);
			int content;
			StringBuilder fileContent = new StringBuilder();
			while ((content = fis.read()) != -1) {
				fileContent.append((char) content);
			}
			System.out.println("Data read from file: " + fileContent.toString());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
