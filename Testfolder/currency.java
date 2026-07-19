import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency =:");
        int rupees = sc.nextInt();
        ChangeCurrency(rupees);
        
    }
    static void ChangeCurrency(int rupees)
    {
        
        double USD;
        USD = rupees / 85.0;  // 1 USD = 85 INR (Indian Rupees)
        System.out.println(USD);



    }

    
}
