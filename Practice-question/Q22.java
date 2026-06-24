      /*Tax calculator program */

import java.util.*;

public class Q22 {
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the salary");
     int sal=sc.nextInt();
     Double Tax;
     if(sal<=10000)
     {
        System.out.println("No tax");
     }
     else if(sal>10000 && sal<=100000)
     {
        Tax = sal * 0.10; // 10% tax
           System.out.println(sal + " " +Tax);
     }
     else
     {
        Tax = sal * 0.20; // 20% tax
            System.out.println(sal + " " +Tax);
     }



    }
}