import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num =:");
        int num = sc.nextInt();

        System.out.println("Enter the num1 =:");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2 =:");
        int num2 = sc.nextInt();
         checklargest(num, num1, num2);
    }

    static void checklargest(int num , int num1 , int num2)
    {     
        if(num > num1)
        {
            if(num >  num2)
            {
                System.out.println("largest = " +num);
            }
            else{
                System.out.println("larges = "+num2);
            }
        }
        else if(num1 > num2)
        {
            if(num1 > num){
                System.out.println("largest = " +num1);

            }
            else{
                
               System.out.println("larges = "+num2);

            }
        }
        else{
            System.out.println("larges = "+num2);
        }
  
    }

    
}
