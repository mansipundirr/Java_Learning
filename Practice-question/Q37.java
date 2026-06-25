     /*   Reverse the number */
    
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();

        while(n >  0)
        {
            int r = n % 10 ; 
           
            System.out.print(r);
            n = n / 10;
        }

    }
}
