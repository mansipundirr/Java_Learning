///////////////////////////////////////////////////////////////////////////*Method Overloading */////////////////////////////////////////////////////////////////////////////////////

class  A {  // super class is called as parent class

    int a,b,c;

    void add(){  // method overloading is a feature that allows a class to have more than one method having the same name, if their parameter lists are different. It is related to compile-time (or static) polymorphism.
        a = 10;
        b = 20;
        System.out.println(a+" "+b);

    }
    void add(int x , int y){  
        c = x+y;
        System.out.println(c);

    }
    void add(int x , double y){
        double c;
        c = x+y;
        System.out.println(c);
    
    }
}
public class Polymorphism { // this is a main class

    

public static void main(String[] args) {
    A r = new A();
    r.add(); // calls the first add method
    r.add(50,80);  // calls the second add method
    r.add(60,45.87);  // calls the third add method
    

  }
}



 ////////////////////////////////////////////////////////////*Method Overriding */////////////////////////////////////////////////////////////////////////////////////
 // Method overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its  
 //super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class,
 //  then the method in the subclass is said to override the method in the super-class.


// class  shape {  // super class is called as parent class

//     void draw(){
//        System.out.println("Can't say shape");

//     }
// }
// class Square extends shape {
//     @Override   // this annotation is used to indicate that the method is intended to override a method in the superclass. It helps catch errors at compile time if the method does not correctly override a method in the superclass.
//     void draw(){
//         super.draw();  // this is used to call the method of super class
//         System.out.println("Square shape");

//     }
 
// }
// public class Polymorphism {
//     public static void main(String[] args) {
//         shape r = new Square();
//         r.draw();
//     }

    
// }