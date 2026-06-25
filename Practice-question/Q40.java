import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
        int c = n;
        int arm = 0;
        while(n > 0)
            {
                  int r = n % 10;
                  arm = (r*r*r) + arm;
                  n = n / 10;
            }
            if(c == arm )
            {
                  System.out.println("Armstorang  number");
            }
            else{
                 System.out.println(" Not a Armstorang number" );
            }
        



    }
}