import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
    
    File x = new File("myfile.txt");
        
    try {
        
        FileReader reader = new FileReader(x);
          
         int line = reader.read();
         
        while(line != -1){
             System.out.print((char)line);
             line = reader.read();
         }
    }
        
    catch (FileNotFoundException e) {
        
        System.out.println("No file");
        
    }
        
        catch(IOException e){
            System.out.println("Input output problem");
        }
        
    
    
    
    }
}