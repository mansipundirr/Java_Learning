// public class ExceptionHandling {

//     public static void main(String[] args) {
        
//         System.out.println("Main method started :");
//         int x = 10;
//         int y = 0;
//         int c;

    
//     try{
        

//        c = x / y;        
//         System.out.println("Dividion :"+c);
        
       
//     }
//     catch(Exception e){
        
//         System.out.println(" Can't divide by 0 ");


//     }
//     System.out.println("Main method ended ");
    
// }
// }




public class ExceptionHandling {

    public static void main(String[] args) {
        
        System.out.println("Main method started :");
       
    
    try{
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(arr[0]);

        String str = "mansi";
        System.out.println(str.toUpperCase());

        int x = 10 , y = 0 , c;
        c = x / y;        
        System.out.println("Dividion :"+c);
        
       
    }
    catch(ArrayIndexOutOfBoundsException a){
        System.out.println("Array Exception");

    }
    catch(ArithmeticException e){
        System.out.println("Arithmetic Exception");
    }
    catch(NumberFormatException n){
        System.out.println("Number Exception");
    }
    catch(Exception e ){
        
        System.out.println("All type Exception handled");


    }
    System.out.println("Main method ended ");
    
}
}