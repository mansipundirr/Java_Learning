import java.util.Scanner;

public class Q9 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Character value: ");
        char ch = sc.next().charAt(0); // next() method is used to read the next token from the input as a string, and charAt(0) is used to get the first character of that string. This allows us to read a single character input from the user.
        
      if(ch == 'a' || ch == 'e' || ch == 'i'||ch == 'o' || ch == 'u' )
      {
      System.out.println("Vowel");
      }
      else {
        System.out.println("Consonant");
      }
    }

    
    
}
