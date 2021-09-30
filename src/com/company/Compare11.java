package com.company;

import java.util.Scanner;

public class Compare11 {

    public static void main(String[] args) {
        short numberOne = 4;
        short numberTwo = 5;
        if (numberOne == numberTwo) {
            System.out.println("both are Equal");
        }

        if (numberOne > numberTwo) {
            System.out.println("Number One is larger, Number two is smaller");
        } else if (numberTwo > numberOne)
            System.out.println("Number Two is larger, Number One is smaller");

//Positive and negative numbers
        numberOne = 5;
        numberTwo = -3;
        if (numberOne > 0 && numberTwo > 0) {
            System.out.println("Both numbers are positive");
        } else if (numberOne < 0 && numberTwo < 0) {
            System.out.println("Both numbers are negative");
        } else {
            System.out.println("One of the numbers is positive and the other one is negative");
        }
        //Even and odd numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String check = (num % 2 == 0) ? "even" : "odd";
        System.out.println("The entered number " + num + " is: " + check);

        // Number is smaller than 100
        numberOne = 65;
        numberTwo = 105;
        if (numberOne < 100) {
            System.out.println("Number One is smaller than 100");
        }
        else if (numberTwo <100) {
            System.out.println("Number Two is smaller than 100");
        }
        else
            System.out.println ("There is no numbers smaller than 100");

    }
}

