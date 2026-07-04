import java.util.*;

class A {        // super class is called as parent class
          int marks;
    void input()
    {

      System.out.println("Enter the college name : ");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println("College Name : "+name);
      System.out.println("Enter the Marks : ");
      marks = sc.nextInt();
        
    }

}
    class B extends A {         // sub class is called as child class1
        void Show() {
        System.out.println("My name is Riya :");

        System.out.println("Maths marks : " + marks);

        }

      }
    class C extends A{         // sub class is called as child class2
         void displ(){
         System.out.println("My name is Mansi :");

         System.out.println("physics marks : " + marks);
         
         }

      }
    
    class Hierarchical{        //  this is a main class
          public static void main(String[] args) {        // main method
           
            B r = new B();
            C r1 = new C();

           
            r.input(); 
            r.Show();

            r1.input();
            r1.displ();


        }
      }

    

