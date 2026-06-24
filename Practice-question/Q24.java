import java.util.*;

public class Q24 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 = ");
        int num1 = sc.nextInt();

        System.out.println("Enter the value of num1 = ");
        int num2 = sc.nextInt();

        System.out.println("Choise the number = ");
        int ch = sc.nextInt();

        if(ch==1)
        {     int cal = num1 + num2;
            System.out.println("ADDTION" + cal);

        }
        else if(ch==2)
        {     int cal = num1 * num2;
            System.out.println("MULTIPLICATION = " +cal);

        }
        else if(ch==3)
        {     int cal = num1 - num2;
            System.out.println("SUBTRACTION =" +cal);

        }
        else if(ch==4)
        {     int cal = num1 / num2;
            System.out.println("DIVISION = " +cal);

        }
        else
        {
            int cal = num1 % num2;
            System.out.println("MODULUS = " +cal);
        }
        
        }
        
        
        
        

    }
    

