import java.util.Scanner;

    

 public class test6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
   
       int c = 2;
       
    if(num <= 1 )
    {
        System.out.println("prime");
    }
    while(c < num)
    {
    
        if(num % c == 0)
        {
            System.out.println("not prime");
            return;
           
        }
    
        c = c + 1;
    }
    

     System.out.println("prime");
}
 }


 
       
    

 
    
    
    
    

