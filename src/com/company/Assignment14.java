package com.company;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number from 1 to 366");
        int day = input.nextInt();
        System.out.println("The day number is" + " " + day);
        if (day >= 1 && day <= 31)
            System.out.println("It is:January");
        if ((day > 31) && (day <= 31 + 28))
            System.out.println("It is: February");
        if ((day > 59) && (day <= 59 + 31))
            System.out.println("It is: March");
        if ((day > 90) && (day <= 90 + 30))
            System.out.println("It is: April");
        if ((day > 120) && (day <= 120 + 31))
            System.out.println("It is: May");
        if ((day > 151) && (day <= 151 + 30))
            System.out.println("It is: June");
        if ((day > 181) && (day <= 181 + 31))
            System.out.println("It is July");
        if ((day > 212) && (day <= 212 + 31))
            System.out.println("It is August");
        if ((day > 243) && (day <= 243 + 30))
            System.out.println("It is September");
        if ((day > 273) && (day <= 273 + 31))
            System.out.println("It is October");
        if ((day > 304) && (day <= 304 + 30))
            System.out.println("It is November");
        if ((day > 334) && (day <= 334 + 31))
            System.out.println("It is December");
// I think there should be some formula (or method), which takes previous result
// to the first brackets and adds the next month's value.
    }
}


