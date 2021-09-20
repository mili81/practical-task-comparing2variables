package com.company;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double hourlyRate = 8;
        double extraHourlyRate = 15;
        // kāpēc šeit neļauj ieevadīt Rate ar komatu(5,5)? Man taču ir double variable?

        Scanner inputWorkingHours = new Scanner(System.in);
        System.out.println("Please enter Number of Working Hours a Day");
        double workingHoursInDay;
        workingHoursInDay = inputWorkingHours.nextDouble();


        if (workingHoursInDay > 0 && workingHoursInDay <= 8) {
            double salaryPerDay = (workingHoursInDay * hourlyRate);
            System.out.println("Your salary for " + workingHoursInDay + " hours will be " + salaryPerDay);
        } else if (workingHoursInDay > 8 && workingHoursInDay <= 24){
            double salaryPerDayExtra = (80 + ((workingHoursInDay - 8) * extraHourlyRate));
            System.out.println("Your salary for " + workingHoursInDay + " hours will be " + salaryPerDayExtra + " Eur.");
        }
        else
            System.out.println("Please check the entered value");

        }

    }

