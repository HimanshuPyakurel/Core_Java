package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	/*
	 *  1> FileWriter : write file
	 *  2> FileReader : read file
	 */
	public static void main(String[] args) throws IOException {
		
		//true helps to append not replace contents.
		FileWriter file = new FileWriter("C://Users//himan//OneDrive//Documents//product.txt",true); 
		
		file.write("Name = Tv \n");
		file.write("Price = 200000 \n");
		file.write("Company = Apple \n");
		
		file.close();
		System.out.println("success");
	}
	
}
