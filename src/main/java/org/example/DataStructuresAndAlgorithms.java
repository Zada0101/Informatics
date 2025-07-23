package org.example;

import java.util.Scanner;

public class DataStructuresAndAlgorithms {

        public void LinearSearch() {
            Scanner scanner = new Scanner(System.in);

            // Read the size of the array
            int N = scanner.nextInt();

            // Read the array elements
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            // Read the number to search for
            int x = scanner.nextInt();

            // Count occurrences of x in the array
            int count = 0;
            for (int num : arr) {
                if (num == x) {
                    count++;
                }
            }

            // Output the result
            System.out.println(count);
        }

}
