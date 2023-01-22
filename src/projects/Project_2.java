package projects;

import java.util.Scanner;

public class Project_2 {
    public static void main(String[] args) {
        /*
        Using Scanner create an array of countries. When an array is created, retrieve all values from it
        and while retrieving those values print capital for each country. (use 2 different loops).
         */
        Scanner scanner = new Scanner(System.in);
        String[] countries = {"India", "China", "USA", "Russia"};
        String[] capitals = {"New Delhi", "Beijing", "Washington D.C.", "Moscow"};

        System.out.println("Enter the number of countries:");
        int n = scanner.nextInt();

        String[] array = new String[n];

        System.out.println("Enter the countries:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        // First loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < countries.length; j++) {
                if(array[i].equals(countries[j])){
                    System.out.println("Capital of " + array[i] + " is: " + capitals[j]);
                }
            }
        }

        // Second loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < countries.length; j++) {
                if(array[i].equals(countries[j])){
                    System.out.println("Capital of " + array[i] + " is: " + capitals[j]);
                }
            }
        }
    }
}
