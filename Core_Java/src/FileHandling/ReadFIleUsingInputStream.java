package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFIleUsingInputStream {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C://Users//himan//OneDrive//Desktop//file.txt");
		int data;
		while((data = file.read()) != -1) {
			System.out.print((char)data);
		}
	
	}

}
