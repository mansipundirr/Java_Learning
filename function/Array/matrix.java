import java.util.*;

public class matrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int row = sc.nextInt();
        System.out.print("enter the number of columns :");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
    
        for(int i=0; i<arr.length; i++){
            for(int j=0; j < arr[i]; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}