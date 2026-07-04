////////////////////////////////////////////////////////////Interface in Java//////////////////////////////////////////////////////////////////////////////////////

// interface Customer {
//     int amt = 1000; // by default public static final
//     void display(); // by default public abstract       
    
// }
// class Bank implements Customer {  // implements keyword is used to implement the interface
//     @Override
//     public void display() { // implementation of display method
//         System.out.println("Amount = " + amt);
//     }
// }
// class Interface {
//     public static void main(String[] args) {
//         Bank b = new Bank();
//         b.display();  // calling the display method of Bank class
//         System.out.println("Amount = " + Customer.amt); // accessing the static variable of interface
//     }
// }




//////////////////////////////////////////////////////////////////Interface method in Java////////////////////////////////////////////////////////////////////////////////////// 

interface client{
    void webdesign(); // by default public abstract
    void webdevelopment(); // by default public abstract
}
abstract class Rajtech implements client{ // implements keyword is used to implement the interface
    @Override
    public void webdesign() { // implementation of webdesign method
        System.out.println("Website design is done by HTML, CSS, JavaScript");
    }
}
class Rahultech extends Rajtech{ // extends keyword is used to inherit the abstract class
    @Override
    public void webdevelopment() { // implementation of webdevelopment method
        System.out.println("Website development is done by Java, PHP, Python");
    }
}
class Interface {
    public static void main(String[] args) {
        Rahultech w = new Rahultech();
        w.webdesign(); // calling the webdesign method of website class
        w.webdevelopment(); // calling the webdevelopment method of website class
    }
}