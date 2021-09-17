package com.company;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter current time hour");
        int time = input.nextInt();
        if (time >= 6 && time <= 12) {
            System.out.println("Good Morning, Sunshine!");
        } else if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon, work hard!");
        } else if (time >= 20 && time <= 24) {
            System.out.println("Good Evening, get some rest!");
        } else if (time < 0 || time > 24) {

            System.out.println("You have entered wrong value, please check and try again");
        } else
            System.out.println("Good night, sleep well!");
        }

    }
