//Write your code here to check number is palindrome number or not string
import java.util.*;

// public static void main(String[] args)
// { 
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Number :");
//     int num = sc.nextInt();
//     int temp = num;
//     int sum = 0;
//     while(num > 0)

//     {
//        int r = num % 10;
//        sum = sum * 10 +r;
//        num = num/10;
     
//     }
//     if(temp == sum){
//         System.out.println("Number is palindrome");
//     }
//     else{
//         System.out.println("Number is not palindrome");
//     }
// }

public static void main(String[] args)
{ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the str :");
    String str = sc.nextLine();
    String name , reverse;
    name = str;
    reverse = new StringBuilder(str).reverse().toString();
    if(name == reverse)
    {
        System.out.println("String is  a palindrome");
    }
    else{
        System.out.println("String is a not  palindrome");

    }





}