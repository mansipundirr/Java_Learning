class A extends Thread {
    
   public void run()
   
        {
            String name = Thread.currentThread().getName();
            try{
                for(int i = 1; i <= 5; i++)
            {
                System.out.println(name);
                Thread.sleep(1000);
                // System.out.println(Thread.currentThread().getPriority());
                
            }
                            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
    
        
        }
    }

class Methods {
    public static void main(String[] args) {
        A t =  new A();
        A t1 =  new A();
        A t2 =  new A();
        A t3 =  new A();
        t.setName("Radhika");
        // t.setPriority(10);

        t1.setName("Krishna");
        
        // t1.setPriority(5);

        t2.setName("Shayam");
        // t2.setPriority(1);

        t3.setName("Mohan");
        // t3.setPriority(8);
        t.start();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        // System.out.println("is Alive: " + t1.isAlive());
        t2.start();
        try {
            t2.join();  // why we 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t3.start();
        t3.interrupt();
       
        
    }
    
}
