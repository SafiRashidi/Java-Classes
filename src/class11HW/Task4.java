package class11HW;

public class Task4 {
    public static void main(String[] args) {
     /*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers
      */
        int [][] numbers={{10,15,20},
                         {12,16,17},
                         {25,35,45}};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers [i][j];
            }
        }
        System.out.println("The sum of all numbers is: "+sum);
    }
}
