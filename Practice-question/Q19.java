import java.util.*;

public class Q19 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value num=");
        int num = sc.nextInt();
        int count = 0;

        while(num > 0)
        {
            num = num / 10; // divide the number by 10 to remove the last digit
            count++; // increment the count for each digit removed
        }

        System.out.println("Number of digits="+ count);
    }

    
}
