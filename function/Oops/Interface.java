interface Customer {
    int amt = 1000; // by default public static final
    void display(); // by default public abstract       
    
}
class Bank implements Customer {
    @Override
    public void display() {
        System.out.println("Amount = " + amt);
    }
}
class Interface {
    public static void main(String[] args) {
        Bank b = new Bank();
        // b.display();
        System.out.println("Amount = " + Customer.amt); // accessing the static variable of interface
    }
}
 