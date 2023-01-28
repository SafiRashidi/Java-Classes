package projects;

public class Project_5 {
    public static void main(String[] args) {
//5)Create a 2D array of integers. Develop a program which will calculate
// the sum of  even and odd numbers for that array.

        int [][] numbers= {{10,17,18,21},
                           {8,23,7,36}};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++){
               if (numbers[i][j] % 2 == 0){
                   evenSum += numbers[i][j];
               } else {
                   oddSum += numbers[i][j];
               }
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: "+ oddSum);
    }
}
