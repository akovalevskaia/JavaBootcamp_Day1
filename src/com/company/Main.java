package com.company;

import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static boolean compareIntegers(int value1, int value2) {
        if (value1 == value2){
            return true;
        }
        if (value1 <= value2) {
            return true;
        }
        if (value1 >= value2) {
            return true;
        }

        return false;
    }

    public static boolean compareBooleans(boolean value1, boolean value2) {
     return value1 == value2;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0 ? true : false;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0 ? true : false;
    }

    public static boolean getOppositeValue(boolean value) {
        return !value;
    }

    public static boolean getOnlyOneTrue(int x, int y) {
        boolean st1 = x == y;
        boolean st2 = x < 0 && y > 0;
        boolean st3 = x > 100 && y > 100;
        return st1 ^ st2 ^ st3;
    }

    public static void main(String[] args) {

        //Task1: Ask user to input two numbers, compare them and output result
        System.out.println("Please, enter an integer value");
        int a = sc.nextInt();
        System.out.println("Please, enter another one(integer value)");
        int b = sc.nextInt();
        System.out.println(compareIntegers(a, b));

        //Task2: Ask user to input two boolean values and compare them.
        System.out.println("Please, enter boolean value");
        boolean b1 = sc.nextBoolean();
        System.out.println("Please, enter another one(boolean value)");
        boolean b2 = sc.nextBoolean();
        System.out.println(compareBooleans(b1, b2));

        //Task3: Ask user to input a whole number and output true, if it is even number and false if it is odd number
        System.out.println("Please, enter an integer value");
        int num1 = sc.nextInt();
        System.out.println(isEven(num1));

        //Task4: Ask user to input a whole number and output false, if it is even number and true if it is odd number
        System.out.println("Please, enter an integer value");
        int num2 = sc.nextInt();
        System.out.println(isOdd(num2));

        //Task5: Write a program which reads boolean value from user and prints out the opposite value
        System.out.println("Please, enter boolean value");
        boolean bl = sc.nextBoolean();
        System.out.println(getOppositeValue(bl));

        //Task6: Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true
        System.out.println("Please, enter integer value");
        int x = sc.nextInt();
        System.out.println("Please, enter another one(integer value)");
        int y = sc.nextInt();
        System.out.println(getOnlyOneTrue(x, y));

    }
}
