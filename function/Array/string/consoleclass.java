import java.util.*;
import java.io.*;

public class consoleclass {
    public static void main(String[] args) {
        String str; 
        char ch[];
        Console obj = System.console(); // why we use console class because we can take input from user and also we can hide the password when we are writing the password in console.
        str = obj.readLine(); // readLine() method of console class to take input from user
         System.out.print("Enter Password: ");
         ch = obj.readPassword(); //  this method is used to hide the password when we are writing the password in console.
        // String a = String.valueOf(ch); // // show the password in console when we are writing the password in console. 
         System.out.print("Username: " +str); 
         System.out.print("Password: " +ch);
          //System.out.print("Password: " +a);


    }
}
