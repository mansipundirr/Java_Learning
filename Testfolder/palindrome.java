import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String name = sc.nextLine();
        checkString(name);
     
        
    }
    static void checkString(String name)
    {
       String original = name;
       String reverse = new StringBuilder(name).reverse().toString();
       if(original.equals(reverse))
       
       {
        System.out.println("palindrome String = " + name);

       }
       else{
         System.out.println("Not palindrome String = " +name);


       }
       
    }
    
}
