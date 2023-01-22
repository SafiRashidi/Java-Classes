package projects;

public class Project_3 {
    public static void main(String[] args) {
        // Create a 2D array of integer values. Print the sum of all numbers.

        int sum = 0;
        int [][] numbers= {{10,20,30},
                            {45,55,66},
                            {30,40,20}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("The sum of all numbers: " + sum);
    }
}
