package Exercise_4_Package;

public class Biggest_Array_Element {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {-4, 22, -990, 1, 194, 528};

        int biggestElement = Integer.MIN_VALUE;

        for (int number : arrayOfNumbers) {
            if (number > biggestElement) {
                biggestElement = number;
            }
        }
        System.out.println("The biggest element in the array is: " + biggestElement);
    }
}
