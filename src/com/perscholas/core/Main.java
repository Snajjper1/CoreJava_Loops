package com.perscholas.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.

        for (int i =0; i <= 10; i++){
            System.out.println(i);
        }

//        Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and
//        prints out each number.

        int i = 0;

        while (i <= 100) {
            System.out.println(i);
            i+= 10;
        }

//        Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out
//        each number.

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

//        Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number
//        if is a multiple of 5, but do not print out any numbers between 25 and 75. Use the “continue”
//        statement to accomplish this.

        for (int i = 1; i <= 100; i++) {
            if (i >= 25 && i <= 75) {
                continue;
            }
            if (i % 5 == 0)
                System.out.println(i);
        }

//        Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number
//        if is a multiple of 5, but do not print out any numbers greater than 50. Use the “break” keyword
//        to accomplish this.

        for (int i = 1; i <= 100; i++) {
            if (i > 50) {
                break;
            }
            if (i % 5 == 0)
                System.out.println(i);
        }

//        Write a program that uses nested for-loops to output the following:
//        Week 1:
//
//        Day 1
//
//        Day 2
//
//        Day 3
//
//        Day 4
//
//        Day 5
//
//        Week 2:
//
//        Day 1
//
//        Day 2
//
//        Day 3
//
//        Day 4
//
//        Day 5

        for (int i = 1; i < 3; i++) {
            System.out.println("Week: " + i + "\n");
            for (int j = 1; j < 6; j++) {
                System.out.println("Day" + j + "\n");
            }
        }

//        Write a program that returns all the available palindromes within 10 and 200. The following
//        output will be produced:
//        11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191


        System.out.println("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        for (int i = num1; i <= num2; i++){
            int rev = 0;
            for (int j = i; j > 0; j /= 10) {
                rev = rev * 10 + j % 10;
            }
            if (i == rev) System.out.print(i + " ");
        }

//        Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will
//        be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to start the range");
        int start = input.nextInt();
        System.out.println("Please enter the number to end range");
        int end = input.nextInt();

        int num = 1;

        while (start <= end){
            System.out.println(start);

            int sum = start + num;
            start = num;
            num = sum;
        }

//        Write a program that nests a for-loop inside another. Print out the inner and outer
//        variable (e.g., i or j) in the inner loop (e.g., System.out.println
//        ("Inner loop: i: " + i + ", j: " + j);).


        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.println("Inner loop:" + i + "j:" + j);
            }
        }

    }
}
