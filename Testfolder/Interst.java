import java.util.Scanner;
public class Interst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time = ");
        int time = sc.nextInt();

        System.out.println("Enter principal = ");
        int principal = sc.nextInt();  // Inilial money
        
        System.out.println("Enter rate = ");
        int rate = sc.nextInt();

        SimpleIntrest(time, principal, rate);



    }
    static void SimpleIntrest(int time ,int principal , int rate)
    {
        int SI;
        SI = time * principal * rate / 100;
        System.out.println("Simple Interst = "+ SI);


    }
    
}
