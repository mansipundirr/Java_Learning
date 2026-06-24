// Write a Java program to calculate the circumference of a circle given its radius. The formula for the circumference of a circle is C = 2 * π * r, where r is the radius of the circle.

import java.util.*;

public class practice4 {
    public static void circumference(double radius)
    {
        double circumference = 2 * Math.PI * radius;
        System.out.print(circumference);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double  radius =  sc.nextDouble();
        circumference(radius);
    }
    
}
