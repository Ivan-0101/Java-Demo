package Exercise_3_Package;

public class Multiple_Of_5 {
    public static void main (String[] args){
        int[] arrayOfNumbers = {1, 2, 3, 4, 8, 9, 10, 15, 6, 7, 5};

        for (int number : arrayOfNumbers) {
            if (number % 5 == 0){
                System.out.println(number);
                break;
            }
        }
    }
}
