package org.example;

import java.util.Scanner;

//Informatics Problem #2936 Hypotenuse
public class Solution {

    public  void hypotenuseCalculator() {

        // Create a scanner to read user input
        // Scanner allows our program to interact with the user by letting them type something in, like their name, age, or any other data
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calculate the hypotenuse
        //double is a data type in Java used to store decimal numbers — numbers that have digits after a decimal point.
        //Decimal numbers are numbers that include a fractional part, separated by a decimal point.
        //Examples of decimal numbers:
        //3.14
        //whole numbers(1;5;200)numbers without points

        //we create variable the name of double to store decimal numbers
        //  hypotenuse -(longest side of triangle)
//Math.sqrt(x)-  Java method - used to calculate the square root of a number,or  when multiplied  numbers by itself and return
        double hypotenuse = Math.sqrt(a * a + b * b);

        // Print the result
        System.out.println(hypotenuse);
    }



//2.Problem #2937. Next and Previous
        public void nextAndPrevious () {
            Scanner scanner = new Scanner(System.in);  // to read input
            int number = scanner.nextInt();            // read integer input

            // Calculate next and previous numbers
            int next = number + 1;
            int previous = number - 1;

            // Print the required messages
            System.out.println("The next number for the number " + number + " is " + next + ".");
            System.out.println("The previous number for the number " + number + " is " + previous + ".");
        }

//3.Problem #2938. Apples division - 1
        //Void- void is Java method we use it to printing or changing a value, but does not give anything back will not return anything (no return value).
    public void ApplesDivision1() {
        Scanner scanner = new Scanner(System.in);  // Create scanner

        int N = scanner.nextInt();  // Read number of children
        int K = scanner.nextInt();  // Read number of apples

        int applesPerChild = K / N; // Integer division

        System.out.println(applesPerChild); // Output result
    }

    //4.Problem #2939. Sharing apples - 2
    public void SharingApples2 () {
        Scanner scanner = new Scanner(System.in);  // Input reader

        int N = scanner.nextInt();  // Number of children
        int K = scanner.nextInt();  // Number of apples

        int applesLeft = K % N;     // Remainder

        System.out.println(applesLeft);  // Output the result
    }

    //5
    public void RingRoadPosition() {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();  // Speed
        int t = scanner.nextInt();  // Time

        int position = ((v * t) % 109 + 109) % 109;
        // Final mark
        System.out.println(position);
    }

    //6.Problem #2942. The tens place of a two-digit number

    public void TensPlace () {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();   // Read two-digit number
        int tens = number / 10;           // Get tens digit

        System.out.println(tens);         // Print tens digit
    }


    //7. Problem #2943. Number of tens
    public  void NumberTens() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int tensDigit = (n / 10) % 10;

        System.out.println(tensDigit);
    }

    //8.Problem #2944. Sum of digits
    public void SumOfDigits() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int hundreds = n / 100;            // First digit
        int tens = (n / 10) % 10;          // Second digit
        int units = n % 10;                // Third digit

        int sum = hundreds + tens + units;

        System.out.println(sum);
    }

    //9.Problem #2945. The next even
    public  void  TheNextEven() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nextEven = n + 2 - (n % 2);

        System.out.println(nextEven);
    }



}






















