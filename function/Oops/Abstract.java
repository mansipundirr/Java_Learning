abstract class Animal {

    Animal(){ // constructor of abstract class
        System.out.println("Animals are Loyal");
       
        
    }
    public abstract void Sound(); // abstract method is a method without a body and it must be implemented by the subclass
}

class Dog extends Animal {
   
    public void Sound(){
        System.out.println("Dog is Barking");
    } 
}     

class Lion extends Dog {
   
    public void Sound(){
        System.out.println("Lion is Roar");

    }    
} 
class Abstract{
    public static void main(String[] args){
        Dog d = new Dog();
        Lion l = new Lion();
        d.Sound();
        l.Sound();
    }
}  

    

