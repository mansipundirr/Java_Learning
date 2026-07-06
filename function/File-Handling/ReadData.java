import java.io.FileReader;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("C:\\Users\\Mansi\\OneDrive\\Desktop\\mansi.Java");
            try {
                int i;
                while((i = r.read())!=-1) {
                    System.out.println((char)i);
                }
            }
                finally {
                    r.close();
                     }
                    }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    System.out.println("Read succesfully");
    }  

   }
