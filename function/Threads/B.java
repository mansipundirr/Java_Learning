            /*  Multithreading by extending Thread class */          

// import java.util.*;

//  class B1 extends Thread {
//      public void run() {
//         try {

//             for (int i = 1; i <= 5; i++) {
//                  System.out.println("Hii Mansi");
//                  Thread.sleep(1000);  // thread sleeps for 1 second
//              }
//         }  

//            catch (Exception e) {
//            System.out.println(e);

//          }
//      }
//  }


//         class B {
//             public static void main(String[] args) throws InterruptedException {
//                 B1 t = new B1();  // object of thread class
//                 t.start();
//                 for (int i = 1; i <= 5; i++) {
//                 System.out.println("Hii Prince");  // start the thread and call the run() method or this creates a new thread and executes the run() method in that thread
//                 Thread.sleep(1000);  // main thread sleeps for 1 second
//             }
//         }
//     }

    /* Multithreading by implementing Runnable interface */
    
import java.util.*;

 class B1 implements Runnable {  // why we use Runnable interface because we can extend another class along with implementing Runnable interface 
     public void run() {
        try {

            for (int i = 1; i <= 5; i++) {
                 System.out.println("Hii Prince");
                 Thread.sleep(1000);  // thread sleeps for 1 second
             }
        }  

           catch (Exception e) {
           System.out.println(e);

         }
     }
 }  
    class B2 extends B1 implements Runnable { // why we use Runnable interface because we can extend another class along with implementing Runnable interface
     public void run() {
        try {

            for (int i = 1; i <= 5; i++) {
                 System.out.println("Hii Mansi");
                 Thread.sleep(1000);  // thread sleeps for 1 second
             }
        }  

           catch (Exception e) {
           System.out.println(e);

         }
     }
 }


        class B {
            public static void main(String[] args)  throws InterruptedException {
                B1 t = new B1();  // object of thread class
                Thread th = new Thread(t); //why we use this 
                B2 t1 = new B2();   // object of thread class
                Thread th1 = new Thread(t1); // creating thread object and passing the runnable object to the thread constructor
                th.start(); // start the thread and call the run() method or this creates a new thread and executes the run() method in that thread
                th1.start();
                
                    } 
            }
        
    

    