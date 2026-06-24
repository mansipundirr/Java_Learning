import java.util.Scanner;


public class calculatesum {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number: ");
       int a = sc.nextInt();
       System.out.print("Enter second number: ");
       int b = sc.nextInt();
       int sum = calculateSum(a, b);
       System.out.println("The sum of 2 numbers is: " + sum);
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }
}