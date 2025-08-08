package Exercise_2_Package;

import java.util.Scanner;

public class Temperature_Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to convert from Celsius to Fahrenheit or Fahrenheit to Celsius?");
        System.out.println("Enter 'C' for Celsius to Fahrenheit or 'F' for Fahrenheit to Celsius: ");
        char direction = scanner.next().charAt(0);

        if (direction == 'C' || direction == 'c') {
            System.out.println("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F.");

        } else if (direction == 'F' || direction == 'f') {
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
        } else {
            System.out.println("Invalid input. Please enter 'C' or 'F'.");
        }

        scanner.close();
    }
}
