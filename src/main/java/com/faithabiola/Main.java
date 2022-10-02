package com.faithabiola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  Write a code to test if a number is odd or even and if the number is less than 10

        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
            int num1 = input.nextInt();

            if (num1 % 2 != 0) {

                System.out.println(num1 + " is odd");

            } else {

                System.out.println(num1 + " is even");
            }
            if (num1 < 10){

                System.out.println( true);
            } else {

                System.out.println( false);
            }
        }
        }
