      /* This program prints the ASCII values of characters from 'A' to the entered character */
import java.util.*;
public class Q11 {
    public static void main(String[] args)

    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter character value: ");
     char ch = sc.next().charAt(0);
    
     for(char i = 'A'; i <= ch; i++ )
     {
        int ascii = i; 
      //System.out.println(i +" "  + (int)i); // seconda method to print the ASCII value of character by type casting
        System.out.println("ASCII value of " + i + " is " + ascii);
     }


    }
    
}
