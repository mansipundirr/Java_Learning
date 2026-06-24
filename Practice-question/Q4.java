import java.util.*;

public class Q4 {
    public static void main(String[] args) 
    {   int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number :");
        int number =sc.nextInt();

        for(int i = 1; i <= number; i++ )

        {
            sum =  sum + i;
        }
            System.out.println("ADDTION OF NUMBERS IS : " + sum);
        
        

    }
    
}
