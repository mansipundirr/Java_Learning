// import java.util.Scanner;
// public class factorialNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int num = sc.nextInt();
//         for(int i = 1; i <= num; i++)
//         {
//             fact(i);
//         }
//     }
//     static void fact(int num)
//     {   
//         int i;
//         int factorial = 1;
//         while(num > 0)
//         {  
//             factorial = factorial * num; 
//             num--;

            
//         }
//            System.out.println(factorial);


         
       
//     }
    
// }
import java.util.Scanner;
public class factorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++)
        {  
            int fact = 1;
            fact = fact * num;
            num--;
            System.out.println(fact);

        }
      


    }
}




