              /* MultiInheritance =  a multiple level inheritance that one super class and more  than one sub class   one parent class and more than one child class  */

import java.util.Scanner;
import java.util.Scanner;


 class A {

    int a , b;

    void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a : ");
        a = sc.nextInt();  
        System.out.println("Enter the value  b : ");
        b = sc.nextInt();
        System.out.println("Hii Mansi");
        }
    } 
 

    class B extends A {

        void calculate(){
             int  sum =  a + b;
             int  sub =  a - b;
             int  multi = a * b;
             int  div =  a / b;
             int  rem =  a % b;
             System.out.println("sum :" +sum);
             System.out.println("sub :" +sub);
             System.out.println("multi :" +multi);
             System.out.println("div :" +div);
             System.out.println("rem :" +rem);
            
        }
    }
    class C extends B{
             void displ(){ 
                System.out.println("This is a example for multiLevelinheritance");
               
             }
    }  
    
    
   class MultiInheritance{
        public static void main(String[] args) {
          C r = new C();
          r.input();
          r.calculate();
          r.displ();
        }
    }


    
    
        
    
  

        
    

    
    
    
    
        
    

    



   