import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name = ");
        String name = sc.nextLine();
        printing(name);

    }
    static void printing(String name)
    {  

    System.out.println("Hello  "+ name + " Pundir") ;

    }
    
}
