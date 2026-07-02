class A{ //class name = parameterized
    
         int x , y;  // instance variable
      
    A(int a,int b)  // parameterized constructor
        {
              x= a;
               y = b;
             
        }
    A(int a , String b)
            {
              
                System.out.println(a +" " +b);

            }
    A(int  i , double j)
             {  
                 
                System.out.println(i+" " +j);

                   
             }
             
    
    void display()  // display method
       {
        System.out.println("x = " +x);
        System.out.println("y = " +y);
         
        
        
    }
}
    
    class B
    {
            public static void main(String[] args)  // main method
            {
             A obj = new A(10,40); // object of class parameterized1
             obj.display(); // calling display method
            A obj1 = new A(10 , "mansi");
            A obj2 = new A(40,50.70);
     }
     }
    


