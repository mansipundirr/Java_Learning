import java.io.*;

public class Createfile {
    public static void main(String[] args) //throws IOException 
    {

        File f = new File("C:\\Users\\Mansi\\OneDrive\\Desktop\\mansi.java");
    try{
        if(f.createNewFile())  
        {
            System.out.println("File succesfully created......!");
        }

        else {  
            System.out.println("File all ready exists....!");
         }
        }
    
    catch(Exception e)
    {
        System.out.println(e);    
    }
    
}
}