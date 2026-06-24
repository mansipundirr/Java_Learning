

import java.util.Scanner;

public class array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
        arr[i] = sc.nextInt();
        }
        System.out.print("value of x:");
        int x = sc.nextInt();
    
        for(int i = 0; i < size; i++){
            if(arr[i]==x){
            System.out.print("found at index :"+i);
        }
    }

}}

