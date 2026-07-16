   // checking the  armstrong number between two numbers
import java.util.Scanner;
public class test2{
    public static void main(String[] args)
    {  
        for(int i = 1; i <= 1000; i++){
            int num = i; 
            int count = 0;
            int sum = 0;
            while(num > 0)
            {
                num = num / 10;
                count++;
            }
            num = i;
            while(num > 0)  {
                
                int r = num % 10; 
                int power =  (int)Math.pow(r, count);
                sum += power;
                num  /= 10;

            }
            if(i == sum)
            {
                System.out.print(i + " ");
            }
            
        }
    }
}
   

        
    
