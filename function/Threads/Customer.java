class Bank extends Thread {
  static int bal = 10000;
  static int withdraw;

    Bank(int withdraw) //
    {
        this.withdraw=withdraw;
    }
    {
        this.withdraw=withdraw;
    }
    public static synchronized void withdraw()
    {
        String name = Thread.currentThread().getName();
        if(withdraw <= bal)
        {
            System.out.println(name + " withdrawn money");
            bal = bal-withdraw;
        }
        else{
            System.out.println(name + " Insufficient Balance");
        }
    }
    public void run()
    {
        withdraw();
    }
}


class Customer {   
public static void main(String[] args){
    Bank obj = new Bank(5000);   // Create a Bank object with an initial balance of 10000 and a withdrawal amount of 5000 
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj);
    t1.setName("Payal");
    t2.setName("Anshi");
   
    Bank obj2 = new Bank(5000); // Create a new Bank object for the second pair of threads 
    Thread t3 = new Thread(obj2);
    Thread t4 = new Thread(obj2);
   
    t3.setName("Vanshi");
    t4.setName("Arti");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
}   
   
}


    

