//15. Write a Java program to demonstrate reading from and writing to an Object Stream.
package POE_Questions;

import java.io.*;

public class ObjectStream_Reading_Writing {

	public static void main(String[] args) {
		String str = "Hello";
		byte[] barray = { 'j', 'a', 'v', 'a', 'T', 'p', 'o', 'i', 'n', 't' };
		try {
			FileOutputStream outstream = new FileOutputStream("d:file1.txt");
			ObjectOutputStream objoutstream = new ObjectOutputStream(outstream);

			objoutstream.writeObject(str);
			objoutstream.writeObject(barray);

			ObjectInputStream objinstream = new ObjectInputStream(new FileInputStream("d:file1.txt"));

			System.out.println("" + (String) objinstream.readObject());
			byte[] read1 = (byte[]) objinstream.readObject();
			String s2 = new String(read1);
			System.out.println("" + s2);
			int rr = objinstream.read(read1, 2, 7);
			System.out.println(" No of bytes read  :" + rr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}