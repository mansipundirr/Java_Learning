import java.util.Scanner;
public class Hcf {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        test(a , b);  
        
        
    }
    static void test(int a, int b)
          {    
        int Hcf = 0;
        int min;
        min = Math.min(a, b);
        while (min >= 1) 
            {
            
            if(a % min == 0 && b % min  == 0)
            {
                Hcf = min;

                System.out.println("Highest commam factor = "+Hcf); 
                break;  
                         
            }  
              min--;
        } 
    }  
      
              
}
   

