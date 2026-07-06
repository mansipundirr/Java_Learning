class InvalidAgeException extends Exception{  //  this is user defined exception class
    InvalidAgeException(String msg){  // constructor of user defined exception class
       super(msg);
        // System.out.println(msg); // this will print the message when exception is thrown
    }

}  
public class HandlingMethod {  // this is main class where we will handle the exception
    public static void main(String[] args) {  //  main method where we will call the method which will throw the exception
        try{
            Vote(20);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
 
        
} 
    public static void Vote(int age) throws InvalidAgeException  //  this method will throw the exception if age is less than 18
        {
     
        if(age < 18)
        {
           throw new InvalidAgeException("Not eligible for votting ");
        }
        else{
            System.out.println("eligible for votting");
        }
            
     


        
    
    }
    
}
