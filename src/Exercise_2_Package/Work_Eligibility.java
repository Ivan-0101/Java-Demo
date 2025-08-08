package Exercise_2_Package;

import java.util.Scanner;

public class Work_Eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your age (integer number)");
        int age = scanner.nextInt();

        if (age >= 16) {
            System.out.println("You are of age eligible to work");
        } else {
            System.out.println("You are not eligible to work at this age");
        }

        scanner.close();
    }
}
