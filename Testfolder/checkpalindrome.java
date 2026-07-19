import java.util.Scanner;
public class checkpalindrome {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int num = sc.nextInt();
        for(int i = 1; i <= 1000; i++)
        {
            check(i);

        }
       
    }

    static void check(int num)
    {   
         int original = num;
         int  rem = 0 ; 
         int sum = 0;

        while(num > 0)
        {
        rem = num % 10;
        sum = sum * 10 + rem;
        num = num / 10;

        }
        if(original == sum)
        {
            System.out.println("Palindrome = " +sum);
        }
        // else{
        //     System.out.println("Not palindrome = "+sum);
        // }




    }
    

}
