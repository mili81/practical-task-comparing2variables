package com.company;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        int day;
        int month;
        int year;
        int format;

        Scanner input = new Scanner(System.in);
        System.out.println("Please write the day: ");

        day = input.nextInt();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please write the month: ");
        month = inputTwo.nextInt();
        Scanner inputThree = new Scanner(System.in);
        System.out.println("Please write the year");
        year = input.nextInt();
        if ((day < 1 || day > 31 || month < 1 || month > 12 || year < 1) ||
                (day > 30 && month == 4 || month == 6 || month == 9 || month == 11) ||
                (day > 28 && month == 2 & year % 4 != 0) ||
                (day > 29 && month == 2)) {
            System.out.println("You have entered invalid value");
        } else if ((day > 1 || day < 31 || month > 1 || month < 12 || year > 1) ||
                (day < 30 && month == 4 || month == 6 || month == 9 || month == 11) ||
                (day < 28 && month == 2 & year % 4 != 0) ||
                (day < 29 && month == 2)) {
            Scanner inputFormat = new Scanner(System.in);
            System.out.println("Please chose date format: 1 - YYYY/MM/DD, 2 - DD.MM.YYYY");
            format = inputFormat.nextInt();
            if (format == 1) {
                System.out.println("Your date is " + year + "/" + month + "/" + day);
            } else {
                System.out.println("Your date is " + day + "." + month + "." + year);
            }
        }

    }
}
