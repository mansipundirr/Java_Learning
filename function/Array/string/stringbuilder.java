import java.util.*;

public class stringbuilder {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    //   // Declaration 

    //     StringBuilder sb = new StringBuilder("Dreams College");
    //     System.out.println(sb);
    

         // Get a charater from Index 


    
    //   StringBuilder sb = new StringBuilder("Dreams College");
    //   System.out.println(sb.charAt(5));


      // Set a charater from Index
      
    //   StringBuilder sb = new StringBuilder("Dreams College");
    //   sb.setCharAt(0,'p');
    //   System.out.println(sb);

      // Insert a character at Some Index 

    //   StringBuilder sb = new StringBuilder("Dreams College");
    //   sb.insert(0,'T');
    //   System.out.println(sb);

      // Delete charater 
    //   StringBuilder sb = new StringBuilder("Dreams College");
    //   sb.delete(0, 1);
    //   System.out.println(sb);

      // Append a char
      StringBuilder sb = new StringBuilder("Dreams College");
      sb.append(" in janta road");
      System.out.println(sb);
      System.out.println(sb.length());
    } 
}
