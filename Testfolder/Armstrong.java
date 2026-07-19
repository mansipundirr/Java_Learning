import java.util.Scanner;
public class Armstrong {
  
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number :");
        // int num = sc.nextInt();
        for(int i = 1; i <= 1000; i++)
        {check(i);

        }

    }

    static  void check(int num) 
    {   

       
        int original = num;
        int sum = 0; 
        int count = 0;
        while(num > 0)
        {
         num = num / 10;
         count++;
        }
        num = original; // Reset num to the original value
        while(num > 0)
        {

         int rem = num % 10;
         sum = sum + (int)Math.pow(rem , count);
         num = num / 10;
        }
         if(original == sum)
         {
             System.out.println(original + " is an Armstrong number");
         }
         else{
             System.out.println(original + " is not an Armstrong number");
         }

     }

}