   /* Default constructor */
   //  Default constructor autlomatically accessed value of instance variable is 0, false, null
    
  public  class Default { // class A
        int x;
       boolean y;
       String z;

        Default() {
           
        }
        
            public static void main(String[] args) { // main method
             Default obj = new Default(); // object of class    
            obj.display(); // calling display metho
     }
        
    
    
    void display() { // display method
       
        System.out.println("x = " + x);
        System.out.println("y = " + y);
         System.out.println("z = " + z);
          
    }
}
    // class B
    // {
    //         public static void main(String[] args) { // main method
    //          Default obj = new Default(); // object of class    
    //         obj.display(); // calling display metho
    //  }
//    }
  