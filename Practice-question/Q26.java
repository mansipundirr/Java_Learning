    /* Area of a Circle */

import java.util.*;

public class Q26 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius = ");
        int r = sc.nextInt();
        Double PI = 3.14;
        
        
        Double Area;
        Area = PI * r * r;

        
        System.out.println("Area of circle = " + Area);
    }
    
}

