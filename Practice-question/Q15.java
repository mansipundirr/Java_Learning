import java.util.*;

public class Q15 {

    public static void main(String[] args) {
        int n, p, result = 1;
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the value of p :");
        p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            result = result * n;
        }
        System.out.println("The result is : " + result);
    }

}
        