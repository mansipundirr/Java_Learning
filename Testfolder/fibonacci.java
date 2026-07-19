import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            find(i);
            
        }
        // find(num);
    }
    static void find(int num)
    {   
        
        int a = 0;
        int b = 1;
        int temp;
        int count = 0;
        while(count <= num)
        {

        temp = b;
        b = a + b;
        a = temp;
        count++;
        
        }
        System.out.print(b + " "); // this method prints the fibonacci series up to the number entered by the user

    }
    
}
