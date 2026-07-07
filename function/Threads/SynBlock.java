class msg {
   public synchronized void show(String name)
   {
    System.out.println("I Want to made a successfull girl ");
    System.out.println("Because i won't depends others");
    // synchronized(this)
    {  
  for(int i = 1; i <= 5; i++)
  {
    System.out.println("How are U " +name);
  }
    
}

System.out.println("hfffffffffffffffffffffffffff ");
System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
}
}
class OurThread extends Thread {  
   msg m;    // this is a reference variable of msg class
   String name;   // this is a reference variable of String class what 
   OurThread(msg m , String name)  // constructor
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);

    }
    
}
public class SynBlock { 
    public static void main(String[] args) {
        msg m = new msg();
        OurThread t1 = new OurThread(m, "mansi");
        OurThread t2 = new OurThread(m, "prince");
        t1.start();
        t2.start();
    }
    }

    


    
