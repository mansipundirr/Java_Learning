import java.util.*;

public class practice7 {
    public static void main(String[] args)
    {
        int positive = 0;
        int negative = 0 , zero = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
        {
            int n = sc.nextInt();
            if(n > 0)
            {
                positive++;
            }
            else if(n < 0)
            {
                negative++;
            }
            else
            {
                zero++;
            }
        }  
        
    }

    public static void positive(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0, zero = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeroes: " + zero);
        positive(args);
    }

}
    

