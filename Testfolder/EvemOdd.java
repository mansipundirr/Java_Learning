public class EvemOdd {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++)
            check(i);
        
    }

    static void check(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Even number = "+num);
        }
        else{
            System.out.println("Odd number = "+num);
        }

    }

    
}
