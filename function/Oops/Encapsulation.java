 class A{
    
    private int marks;  // private variable can only be accessed within the class

    public void setMarks(int marks) {  // setter method to set the value of marks
        this.marks = marks;
    }

    public int getMarks() {  // getter method to get the value of marks
        return marks;
    }

 }
 class Encapsulation {
    public static void main(String[] args) {
        A r = new A();
        r.setMarks(80);  // setting the value of marks using setter method
        System.out.println("Marks = " + r.getMarks());  // getting the value of marks using getter method
    }
}