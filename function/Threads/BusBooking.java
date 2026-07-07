class Booking implements Runnable{
    int availableSeats=1, passengers;
     Booking(int passengers){
        this.passengers = passengers;
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(availableSeats >= passengers){
            System.out.println(passengers + " seats are available for " + name);
            availableSeats -= passengers;
        }
        else{
            System.out.println("Sorry! No seats are available for " + name);
        }
        // Implementation for the run method
    }
}
class BusBooking {
    public static void main(String[] args) {
        Booking bus = new Booking(1); // Create a Bus object with 1 available seat

        Thread t1 = new Thread(bus);
        Thread t2 = new Thread(bus);
        Thread t3 = new Thread(bus);
        t1.setName("mansi");
        t2.setName("priya");
        t3.setName("rohit");

        t1.start();
        t2.start();
        t3.start();
    }
}