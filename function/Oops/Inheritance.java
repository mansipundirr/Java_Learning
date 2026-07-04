             /* Simple inheritance = In  which one super class and only one sub class is called simple inheritance */
import java.util.function.*;    
import java.util.Scanner;   

 class Mansi  {  // This is super class and it is taking the input from user

    int roll;
    int marks;
    String name;

    void input() // This method is in super class and it is taking the input from user
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number :");
        roll = sc.nextInt();

        System.out.println("Enter the marks number :");
        marks = sc.nextInt();

        System.out.println("Enter the Name :");
        name = sc.next();



    }
}

    class Inheritance extends  Mansi{     // This is sub class and Mansi is super class the sub class is inheriting the properties of super class 
    
    void displ(){  // This method is in sub class and it is displaying the values of super class

        System.out.println("roll number : " +roll +" " + "marks : " +marks+ " "+"name : " +name);
        int phy = 80;
        System.out.println("phy marks : " + phy);
    }


    public static void main(String[] args) { 
        Inheritance r = new Inheritance();  // Creating an object of sub class
        r.input();
        r.displ();
    }
    
}
 