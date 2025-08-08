package Exercise_1_Package;

import java.util.Scanner;

public class Minutes_Into_Years_And_Days_Convertor_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = sc.nextLong();

        long minutesInDay = (60 * 24);
        long minutesInYear = (minutesInDay * 365);

        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear) / minutesInDay;

        System.out.println(minutes + " minutes are equal to " + years + " years and " + days + " days.");
    }
}