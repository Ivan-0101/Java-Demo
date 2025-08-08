package Exercise_2_Package;

import java.util.Scanner;

public class Triangle_By_Given_Angles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input angle A");
        double angleA = scanner.nextDouble();
        System.out.println("Please, input angle B");
        double angleB = scanner.nextDouble();
        System.out.println("Please, input angle C");
        double angleC = scanner.nextDouble();

        if (angleA <= 0 || angleB <= 0 || angleC <= 0 || angleA + angleB + angleC != 180) {
            System.out.println("The triangle can't be built");

        } else {
            System.out.print("The triangle can be built ");

            if (angleA < 90 && angleB < 90 && angleC < 90) {
                System.out.println("and it's an Acute one.");
            } else if (angleA == 90 || angleB == 90 || angleC == 90) {
                System.out.println("and it's a Right-Angled one.");
            } else if (angleA > 90 || angleB > 90 || angleC > 90) {
                System.out.println("and it's an Obtuse one.");
            }
        }
    }
}