package org.example;

import java.util.Scanner;

public class ArithmeticOperators {

    /*this is a printing function
    this is my program
    */
    public static int newValue(int num) {
        num ^= 3;
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter a number1: ");

        int num1 = in.nextInt();

        System.out.print("Enter a number2: ");

        int num2 = in.nextInt();

        boolean result = num1 == num2;

        System.out.println("The result is: " + result);
    }
}
