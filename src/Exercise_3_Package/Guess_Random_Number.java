package Exercise_3_Package;

import java.util.Scanner;

public class Guess_Random_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number - enter an integer number:");
        int numberGuess = scanner.nextInt();

        boolean isGuessed = false;

        while (isGuessed == false) {
            if (numberGuess == 10) {
                System.out.println("Correct - you guessed the number!");
                isGuessed = true;
            }
            else if (numberGuess < 10) {
                System.out.println("Your guess is too low");
                numberGuess = scanner.nextInt();
            }
            else {
                System.out.println("Your guess is too high");
                numberGuess = scanner.nextInt();
            }
        }
        scanner.close();
    }
}
