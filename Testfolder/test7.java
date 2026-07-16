import java.util.Scanner;

public class test7 {
  
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a:");
        int a = sc.nextInt();

        System.out.println("Enter the values of b:");
        int b = sc.nextInt();

        System.out.println("Least Comman Multiple = "+LCM);
        result(a, b);

    }

    static int  result(int a , int b)
    {   int max = 0;
           int LCM;
         max = Math.max(a,b);
          while(true){
              if(max % a == 0 && max % b == 0)
              {
                  LCM = max;
                 

                  return LCM;
              }
              
              max++;

          }
    }

}

    

