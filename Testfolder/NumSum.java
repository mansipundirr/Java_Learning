import java.util.Scanner;

public class NumSum {
     public static void main(String[] args)
     {         
             
             test(""); // calling the test method and passing an empty string as an argument
    

          }
        
    public static void  test(String input)
    { 
       
      
        int sum = 0;
       
       while(true)  // this method creates an infinite loop that will continue until the user inputs "x"
       { 
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            
            input = sc.nextLine();
            if(input.equals("x")){  // this method checks if the input is equal to x and if it is then it breaks the loop 
                  break;


            }
            int num = Integer.parseInt(input);  // this method converts the input string to an integer
            sum = sum + Integer.parseInt(input);   
            
       }
        System.out.println("Sum is: " + sum);
               
            

    }

}          
             
              
             
            
             
              
             
            
           
             
          
         
          
    
