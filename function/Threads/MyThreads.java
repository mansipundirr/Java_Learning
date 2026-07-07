
class B extends Thread  {
   public void run()
    {
        String n = Thread.currentThread().getName();

        for(int i = 1; i <= 5; i++)
        {
            System.out.println(n);
        }

    }
}

class MyThreads {

    public static void main(String[] args) {
        B t = new B();
        B t1 = new B();
        B t2 = new B();
        t.setName("This is a threads......!");
        t1.setName("This is a mansi......!");
        t2.setName("This is a prince......!");
        t.start();
        t1.start();
        t2.start();
        
       
     
    }
}







