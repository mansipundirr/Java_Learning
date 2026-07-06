import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
    try{

        FileWriter f = new FileWriter("C:\\Users\\Mansi\\OneDrive\\Desktop\\Java");
    
        try{

            f.write("Java programming is a modrate...!,I Want to made a software Developer");
        
          } 
    
    
       finally{ 
            f.close();
            System.out.println("Succesfully data wrote in file");  
          }
    }
    
    catch(IOException i) 
        {
       System.out.println(i);
       }        
    
    }

}
