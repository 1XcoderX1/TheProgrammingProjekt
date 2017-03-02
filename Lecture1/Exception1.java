

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) {

		File x = new File("/Users/merlin11/workspace/Lecture1/src/kxa654/myfile.txt");

		try {

			FileReader reader = new FileReader(x);
			
			int c = reader.read();
			System.out.println((char)c);
			
			
		}

		catch (FileNotFoundException e) {

			System.out.println("No file");

		} catch (IOException e) {
			System.out.println("NO chars to read");
		}

	}

}
