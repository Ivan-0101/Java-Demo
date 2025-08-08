package Exercise_2_Package;

import java.util.Scanner;

public class Revenue_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();

        double priceBeforeDiscount = unitPrice * quantity;
        double discount = 0;

        if (quantity >= 100 && quantity <= 120) {
            discount = 0.15;
        } else if (quantity > 120) {
            discount = 0.2;
        }

        double discountInPercentages = discount * 100;
        double discountInDollars = priceBeforeDiscount * discount;
        double revenue = priceBeforeDiscount - discountInDollars;

        System.out.println("The revenue from sale is: " + revenue + "$");
        System.out.println("Discount: " + discountInDollars + "$(" + discountInPercentages + "%)");

        scanner.close();
    }
}
