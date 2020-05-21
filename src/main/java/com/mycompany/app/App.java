package com.mycompany.app;

/**
 * Main Class
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * To check for leap year
     *  params - year
     */
    public boolean checkForLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0){
            return false;
        } else {
            return true;
        }
    }
}
