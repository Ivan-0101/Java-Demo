package Exercise_3_Package;

import java.util.List;
import java.util.Arrays;

public class Calculate_Average_Of_List {
    public static void main (String[] args){
        List<Double> numbers = Arrays.asList(3.0, 6.77, 2.0, 98.0, 35.2, 8.008, 7.0, 123.0, 5.0, 1201.25904);
        double sum = 0;

        for (double number: numbers){
            sum+=number;
        }

        double average = sum/numbers.size();
        System.out.println("The average of the list is: " + average);
    }
}
