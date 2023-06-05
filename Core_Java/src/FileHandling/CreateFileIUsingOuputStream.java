package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileIUsingOuputStream {
	/*
	 *  1> FileInputStream  : to create read file
	 *  2> FileOutputStream : to write file
	 */

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file;
			file = new FileOutputStream("C://Users//himan//OneDrive//Desktop//file.txt");
			file.write("Welcome to you in the file handling".getBytes());
			
			file.close();
			System.out.println("sucess...");
			
		
	
	}
}
