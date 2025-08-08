package Exercise_2_Package;

import java.util.Scanner;

public class Vacation_Advisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vacation type - Beach or Mountain: ");
        String vacationType = scanner.nextLine();

        System.out.println("Enter budget per day: ");
        double budget = scanner.nextDouble();

        if (vacationType.equals("Beach")) {
            if (budget < 50) {
                System.out.println("Recommended destination: Bulgaria");
            } else {
                System.out.println("Recommended destination: Outside Bulgaria");
            }
        } else if (vacationType.equals("Mountain")) {
            if (budget < 30) {
                System.out.println("Recommended destination: Bulgaria");
            } else {
                System.out.println("Recommended destination: Outside Bulgaria");
            }
        } else {
            System.out.println("Sorry, we have no information about this type of vacation.");
        }

        scanner.close();
    }
}
