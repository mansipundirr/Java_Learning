                       /* Copy Constructor */
class Car {

        String  brand;
        String colour;
    Car(){

        brand = "BMW";
        colour = "white";
        

       
       
     }
    Car(Car ref){
       
        brand = ref.brand;
        colour = ref.colour;
        
        
       

     }
     public static void main(String[] args){
        Car r = new Car();
        Car r2 = new Car();
        System.out.println(r2.brand+" "+r2.colour);
        System.out.println(r.brand+" "+r.colour);
    }
   
     }

          

           
        
    
    

