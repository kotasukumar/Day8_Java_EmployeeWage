package com.company;

public class Employee {

    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program");
        
        int PER_HOUR_WAGE = 20;
        int WORKING_HOURS = 0;

        double random = Math.floor(Math.random() * 10) % 2;
        if(random == 1){
            WORKING_HOURS = 8;
            System.out.println("Employee is present");
        }
        else{
            WORKING_HOURS = 0;
            System.out.println("Employee is absent");
        }
        int daily_wage = PER_HOUR_WAGE * WORKING_HOURS;
        System.out.println("today wage is: " + daily_wage);
    }
}
