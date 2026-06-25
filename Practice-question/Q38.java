import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
        int sum = 0;
        
        while(n >  0)
        {
            int r = n % 10 ; 
            sum = sum + r;
            n = n / 10;
        }
            System.out.println("Sum of Digits " + sum);
            

        }

    }


