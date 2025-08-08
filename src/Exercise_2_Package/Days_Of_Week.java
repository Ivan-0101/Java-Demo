package Exercise_2_Package;

import java.util.Scanner;

public class Days_Of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter an integer number between 1 and 7");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("The " + number + "-st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The " + number + "-nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The " + number + "-rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The " + number + "-th day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The " + number + "-th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The " + number + "-th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The " + number + "-th day of the week is Sunday.");
                break;
                default:
                    System.out.println("Invalid input");
                    break;
        }
        scanner.close();
    }
}
