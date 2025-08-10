package Exercise_4_Package;

import java.util.ArrayList;
import java.util.Scanner;

public class Lottery_Numbers {

    public static void main(String[] args) {
        ArrayList<Integer> winningNumbers = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Lottery Manager");
            System.out.println("1. Add Lottery Number");
            System.out.println("2. View Winning Numbers");
            System.out.println("3. Check if Number is Winning");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter a lottery number to add: ");
                int number = sc.nextInt();
                winningNumbers.add(number);
                System.out.println("Number " + number + " added to the winning numbers.");
            }
            else if (choice == 2) {
                if (winningNumbers.isEmpty()) {
                    System.out.println("No winning numbers yet.");
                } else {
                    System.out.print("Winning Numbers: ");
                    for (int i = 0; i < winningNumbers.size(); i++) {
                        System.out.print(winningNumbers.get(i) + " ");
                    }
                    System.out.println();
                }
            }
            else if (choice == 3) {
                System.out.print("Enter a number to check if it's winning: ");
                int numberToCheck = sc.nextInt();

                boolean isWinning = false;
                for (int i = 0; i < winningNumbers.size(); i++) {
                    if (winningNumbers.get(i) == numberToCheck) {
                        isWinning = true;
                        break;
                    }
                }

                if (isWinning) {
                    System.out.println("Yes, " + numberToCheck + " is a winning number.");
                } else {
                    System.out.println("No, " + numberToCheck + " is not a winning number.");
                }
            }
            else if (choice == 4) {
                System.out.println("Exiting Lottery Manager. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }

        }
        sc.close();
    }
}
