import java.util.*;
public class Q23 {

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value number = ");
      int num = sc.nextInt();
    if(num % 5 == 0)
    {
        System.out.println(num + " Is Multiple of 5");
    }
   else {
    System.out.println(num +" Not Multiple of 5");
   }
    }
    
}
