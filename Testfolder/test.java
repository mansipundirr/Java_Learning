import java.util.Scanner;

public class test{

    public static void main(String[] args)
       {  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num = sc.nextInt();
    int original = num;
    int count = 0;
    int sum = 0;
    while(num > 0)
    {  
        num = num / 10;
          count++;
    }
    num = original;
    while(num > 0)
    {
        int r = num % 10; 
        int power =  (int)Math.pow(r, count);
        sum += power;
        num  /= 10;
    }
        if(original == sum)
        {
            System.out.println("Number is armstrong");
            }
        else
        {
            System.out.println("Number is not armstrong");
            }  
    

    
 }
    
}
