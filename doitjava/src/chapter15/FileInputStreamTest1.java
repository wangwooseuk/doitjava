package chapter15;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileReader fis = null;
		try {
			fis = new FileReader("C:\\Users\\java11\\git\\doitjava\\doitjava\\src\\chapter15\\Input.txt");
			int word;
			while((word = fis.read()) != -1) {
				System.out.print((char)word);
			}
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				if(fis != null) fis.close();
			} catch(IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
