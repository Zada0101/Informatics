package org.example;

import java.util.Scanner;

//Informatics Problem #2936 Hypotenuse
public class Solution {

    public void hypotenuseCalculator() {

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
    public void nextAndPrevious() {
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
    public void SharingApples2() {
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

    public void TensPlace() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();   // Read two-digit number
        int tens = number / 10;           // Get tens digit

        System.out.println(tens);         // Print tens digit
    }


    //7. Problem #2943. Number of tens
    public void NumberTens() {
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
    public void TheNextEven() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nextEven = n + 2 - (n % 2);

        System.out.println(nextEven);
    }

    //10.Problem #2947. Electronic clock - 1
    public void ElectronicClock() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();           // total minutes since midnight
        int totalMinutes = n % 1440;         // wrap around after 24 hours

        int hours = totalMinutes / 60;       // get hours (0 to 23)
        int minutes = totalMinutes % 60;     // get minutes (0 to 59)

        System.out.println(hours + " " + minutes);


    }

    //Problem #292. Maximum of two numbers
    public void MaximumOfTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        }

    }

//P2
    //leap year - means 366days; in one year; 1-365days just a year;
    //ex:2025-is not leap year because have just 365days in 1 year;
    //2024-is leap years because have 366days in 1 year;

    public void LeapYear() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                //if(year % 400 == 0){
                System.out.println("Yes");
            }
        } else
            System.out.println("No");
        // }
    }


    //Loop
    public void Array() {
        Scanner scanner = new Scanner(System.in);
        //we create variable n to store length of array  that comes from scanner; 5
        int n = scanner.nextInt();

        //we create array a and  give the length of array; [0, 0 ,0, 0, 0]
        int[] a = new int[n]; //n array.length that we give or write on scanner

        //Read n numbers from and store them in the array;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt(); //[0,1,2,3,4]
        }

        // Step 4: Print elements at even indices (0, 2, 4, ...)
        for (int i = 0; i < n; i += 2) {
            System.out.println(a[i] + " ");
        }

        scanner.close();
    }

    public void Balls1() {
        Scanner scanner = new Scanner(System.in);  // Create Scanner to read input

        // Step 1: Read how many balls there are
        int n = scanner.nextInt(); //5

        // Step 2: Create an array to store the colors of the balls
        int[] balls = new int[n]; //[0,0,0,0,0]

        // Step 3: Read the ball colors into the array
        for (int i = 0; i < n; i++) {
            balls[i] = scanner.nextInt();  // Read each ball color; [1,2,4,2,2]
        }

        // Step 4: Go through the array and count repeating colors
        int count = 1;  // Start counting from the first ball

        for (int i = 1; i < n; i++) { //n=5 length of array
            if (balls[i] == balls[i - 1]) { //index 0 because i-1=0; index 1;...
                // Same color as previous ball → increase the count
                count++;
            } else {
                // Different color → check if previous group was a chain
                if (count >= 3) {
                    System.out.println(count);  // Found the chain to destroy
                    return;  // Exit the program (only one chain allowed)
                }
                count = 1;  // Reset count for the new color group
            }
        }

        // Step 5: After the loop, check the last group
        if (count >= 3) {
            System.out.println(count);  // Last group is a chain
        } else {
            System.out.println(0);  // No chain found
        }
        scanner.close();  // Close the input scanner (good practice)
    }

//1433 – Rabbits
    public void Rabbits() {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int cage = scanner.nextInt();

        //This is a classic use of the Dirichlet (Pigeonhole) Principle.
        int maxRabbit =(r+cage-1) / r;

        System.out.println(maxRabbit);


    }



}


































