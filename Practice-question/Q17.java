import java.util.*;

public class Q17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Subject 1 = ");
        int a= sc.nextInt();
        System.out.println("Enter marks for Subject 2 = ");
        int b= sc.nextInt();
        System.out.println("Enter marks for Subject 3 = ");
        int c= sc.nextInt();
        System.out.println("Enter marks for Subject 4 = ");
        int d= sc.nextInt();
        System.out.println("Enter marks for Subject 5 = ");
        int e= sc.nextInt();
        
        int  Total  = a+b+c+d+e;
        System.out.println("Total marks = " + Total); 
        
        Double Average = Total/5.0;
        System.out.println("Average marks = " + Average);
        
        }




    }

    

