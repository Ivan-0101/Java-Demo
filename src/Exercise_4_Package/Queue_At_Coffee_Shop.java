package Exercise_4_Package;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_At_Coffee_Shop {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Coffee Shop Queue Management");
            System.out.println("1. Add Customer to the Queue");
            System.out.println("2. Serve (Remove) Customer from the Queue");
            System.out.println("3. View Current Line");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter customer name: ");
                String customerName = sc.nextLine();
                queue.offer(customerName);
                System.out.println(customerName + " added to the queue.");
            }
            else if (choice == 2) {
                if (!queue.isEmpty()) {
                    String servedCustomer = queue.poll();
                    System.out.println(servedCustomer + " has been served and removed from the queue.");
                } else {
                    System.out.println("No customers in the queue to serve.");
                }
            }
            else if (choice == 3) {
                if (queue.isEmpty()) {
                    System.out.println("The queue is empty.");
                } else {
                    System.out.println("Customers in the queue:");
                    for (String customer : queue) {
                        System.out.println(customer);
                    }
                }
            }
            else if (choice == 4) {
                System.out.println("Exiting Coffee Shop Queue Management. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}