//13. Write a Java program to demonstrate BufferedReader and BufferedWriter
package POE_Questions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_Writer {

	public static void main(String[] args) {
		String data = "Hello this is BufferedReader and BufferedWriter in Java.";
		String filePath = "d://example_buffered.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			writer.write(data);
			System.out.println("Data written to file successfully.");
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			StringBuilder fileContent = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				fileContent.append(line).append("\n");
			}
			System.out.println("Data read from file: \n " + fileContent.toString().trim());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
