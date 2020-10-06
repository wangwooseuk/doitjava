package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\java11\\git\\doitjava\\doitjava\\src\\chapter15\\Reader.txt"))) {
			int i;
			while((i=isr.read()) != -1) {
				System.err.print((char)i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
