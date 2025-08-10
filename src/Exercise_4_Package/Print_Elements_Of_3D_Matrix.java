package Exercise_4_Package;
import java.util.Arrays;

public class Print_Elements_Of_3D_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30 ,40},
                {-1, -2, -3, -4},
                {11, 22, 33 ,44}
        };
        System.out.println("The elements of the matrix (in one line) are: " + Arrays.deepToString(matrix));

        System.out.println("The elements of the matrix (by rows) are: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}