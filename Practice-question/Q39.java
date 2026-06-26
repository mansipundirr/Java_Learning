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
            r = n % 10;   // step--> 121 % 10 = 1    step2 --> 12 % 10 = 2  step3 --> 1 % 10 =  1 
           sum = sum * 10 + r;   //  step1 -->  0 * 10 + 1 = 1    step2 -->  1 * 10 + 2 = 12     step3 --> 12 * 10 + r = 121
            n = n / 10; //   step1 -->  121 / 10 = 12    
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