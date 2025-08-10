package Exercise_4_Package;

import java.util.Arrays;

public class Sum_Of_Array_Elements {
    public static void main (String[] args) {
        double[] doubleArray = {1.2, 2.3, 3.4, 4.5};
        double sumFromIndexAdding = doubleArray[0] + doubleArray[1] + doubleArray[2] + doubleArray[3];
    System.out.println("V.1 The sum of the array elements is: " + sumFromIndexAdding);

    double sumFromLoop = 0;
    for(double number : doubleArray){
        sumFromLoop += number;
    }
        System.out.println("V.2 The sum of the array elements is: " + sumFromLoop);
    }
}
