package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C://Users//himan//OneDrive//Desktop//product.txt");
		
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		
		File folder = new File("C://Users//himan//OneDrive//Documents//Java8am");
		folder.mkdir();
		
		//get all file names from folder
		String[] filenames =  folder.list();
		System.out.println(Arrays.toString(filenames));
		
		//get all files from folder
		File[] files = folder.listFiles();
		
		
		//Read content of files
		Arrays.asList(files).forEach(f -> 
				{
					try {
						System.out.println(Files.readString(Path.of(f.getAbsolutePath()))); 
						System.out.println();
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
		
		
		
		
	}
}
