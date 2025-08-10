package Exercise_4_Package;

import java.util.Arrays;
import java.util.Scanner;

public class Elements_Of_Matrix_By_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
                {10, 20, 30, 40},
                {-1, -2, -3, -4},
                {11, 22, 33, 44}
        };

        System.out.println("Please enter row: ");
        int row = sc.nextInt();
        System.out.println("Please enter column: ");
        int col = sc.nextInt();

        if (row < 0){
            System.out.println("Negative rows are not supported");
        }
        else if (col < 0){
            System.out.println("Negative columns are not supported");
        }
        else if (row >= matrix.length){
            System.out.println("You've entered a higher row number than available in the matrix: " + row);
        }
        else if (col >matrix[row].length){
            System.out.println("You've entered a higher column number than available in the matrix: " + col);
        }
        else {
            System.out.println("The value for row " + row + " - column " + col + " is: " + matrix[row][col]);
        }
    }
}