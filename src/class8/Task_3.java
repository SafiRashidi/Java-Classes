package class8;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        // Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers.

        Scanner scanner = new Scanner(System.in);
        int start, end, evenSum = 0, oddSum = 0;

        System.out.print("Enter start of range: ");
        start = scanner.nextInt();

        System.out.print("Enter end of range: ");
        end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers: "+ evenSum);
        System.out.println("Sum of odd numbers: "+ oddSum);

    }
}
