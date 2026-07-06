package function.Threads;



 class B extends Thread {
   public void run()
    {
        try{
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Hii Mansi");
        }
    
    
}
        catch(Exception e){

}
    }
}
    class A { 
        public static void main(String[] args) {
            B t = new B();
            t.start();
            
        }

    
    
    }

    
