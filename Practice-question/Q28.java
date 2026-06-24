       /* Area of Triangle */

import java.util.*;
public class Q28 {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Base = ");
    float Base = sc.nextFloat();

    System.out.println("Enter the Height = ");
    float Height = sc.nextFloat();

    float Area = (Base * Height)/2;
    System.out.println("Area of Triangle = " + Area);
}
}