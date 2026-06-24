public class hollowrectangle {

public static void main(String[] args) {
    int rows = 5; // Number of rows for the pattern
    int columns = 10; // Number of columns for the pattern

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= columns; j++) {
            // Print '*' for the first and last row, and for the first and last column
            if (i == 1 || i == rows || j == 1 || j == columns) {
                System.out.print("*");
            } else {
                System.out.print(" "); // Print space for hollow part
            }
        }
        System.out.println(); // Move to the next line after each row
    }
  }
}  

