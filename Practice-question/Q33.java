// import java.util.*;
// public class Q33 {
//     public static void main(String[] args)
//     {

    
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter the year = ");
//       int year = sc.nextInt();

//       if(year % 400 ==0 ||  year % 4 == 0 || year % 100 != 0) 
//       {
//             System.out.println("Leap year = " + year);
//       }
//       else{
//         System.out.println(" Not a Leap year = " + year);
//       }


//     }

// }

import java.util.*;
public class Q33 {
    public static void main(String[] args)
    {

    
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the year = ");
      int year = sc.nextInt();


      if(year % 400 == 0)

      { 
            if(year % 100 == 0)
        {
           
            System.out.println("Leap year = " + year);
        }
            else{
            System.out.println(" Not a Leap year = " + year);
        }

        
      }
      else
      {
        
        if(year % 4 == 0)
        { 
            if(year % 100 != 0)
            {
                System.out.println("Leap year = " + year);
            }
            else{
                System.out.println(" Not a Leap year = " + year);
            }

           
        }
        else{
            System.out.println(" Not a Leap year = " + year);
        }
      }
    }
    }



    

