import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
        int c = n;
        int sum = 0 , r;
        while(n > 0)
        {
           r = n % 10;  // 121 % 10 = 1
           sum = sum * 10 + r;  // 0 * 10 + 1 = 1
            n = n / 10; // 121 / 10 = 12
        }
        if(c == sum)
        {
           System.out.println("Palindrome");
            

        }
        else{
            System.out.println(" Not Palindrome");
        }
        }
    
}