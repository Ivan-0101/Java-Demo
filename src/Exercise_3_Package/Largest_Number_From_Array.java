package Exercise_3_Package;

public class Largest_Number_From_Array {
    public static void main (String[] args){

        int[] arrayOfNumbers = {1, 42, 5, 6};
        int largestNumber = Integer.MIN_VALUE;

        for (int number : arrayOfNumbers) {
            if (number > largestNumber){
                largestNumber = number;
            }
        }
        System.out.println("The largest number is " + largestNumber);
    }
}
