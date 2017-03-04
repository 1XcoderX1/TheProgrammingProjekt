package fuga;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class PrinterWriter {
		public static void main(String[] args) throws IOException, NullPointerException {

			Scanner s;
			String o = "a";
		

			File x = new File("\\Users\\User\\Desktop\\Practice\\TheProgrammingProjekt\\Lecture2\\Homework\\Fuga\\myfile.txt");
			FileWriter writer = new FileWriter(x);

			System.out.println("Enter to add in file");

			s = new Scanner(System.in);

			while (!o.equals("out")) {
	           
				o = s.nextLine();
				
				writer.write(o);
                writer.write(System.lineSeparator());

			}

			writer.close();
			s.close();

		}
	}

