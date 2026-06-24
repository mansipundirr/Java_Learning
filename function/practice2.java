import java.util.Scanner;

public class practice2 {
    public static void practice2(int a, int b, int c)
    {
        int sum = a + b + c;
        int average = sum / 3;
        System.out.println("sum of 3 numbers is :" + sum);
        System.out.println("average of 3 numbers is :" + average);      

    }   
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        practice2(a,b,c);
     }
    
}
