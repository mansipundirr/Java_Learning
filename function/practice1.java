import java.util.Scanner;

public class practice1 {
 public static void practice1(int a, int b, int c)
   {
    if(a > b && a > c)
    {
        System.out.println("a is greatest");
    }
    else if(b > a && b > c)
    {
        System.out.println("b is greatest");
    }
    else
    {
        System.out.println("c is greatest");
    }
    
}
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        practice1(a,b,c);


     }
    
}
