        /*  Take character input from user */

import java.util.*;

public class Q8 {
    public static void main(String[] args)
    {
        char  ch;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter character :");
        ch = sc.next().charAt(0);// charAt(0) is used to get the first character of the input string
        System.out.println(ch);
    }
    
}
