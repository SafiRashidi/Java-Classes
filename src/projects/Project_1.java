package projects;

import java.util.Scanner;

public class Project_1 {
    public static void main(String[] args) {
        // 1)Using Scanner create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int numbers = scanner.nextInt();
        int [] arrays = new int[numbers];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numbers; i++) {
            arrays[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            sum += arrays[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
