package Exercise_3_Package;

public class Numbers_Divisible_By_5 {
    public static void main (String[] args) {

        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int number : list1) {
            if (number > 150) {
                continue;
            }

            if (number % 5 == 0) {
                System.out.println("Number " + number + " is divisible by 5");
            }
        }
    }
}