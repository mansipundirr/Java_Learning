import java.util.*;

public class practice5 {
   // public static void Elligible(int age)
   public static boolean isElligible(int age)
   
    {
        if(age >= 18)
        {
         return true;
           // System.out.print("Elligible to vote");
         }
         
        return false;
         
        // else {
        //     System.out.print("Not Elligible to vote");
        // }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // isEigible(age);
        System.out.println(isElligible(age));
    }
    
}
