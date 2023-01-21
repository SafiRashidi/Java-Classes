package class11HW;

public class Task5 {
    public static void main(String[] args) {
/*
Create a 2D array or integer type where you will store odd and even numbers
in 3 rows and 4 columns. Develop a program which will identify/print
the even numbers only.
 */

        int [][] numbers= {{10,17,36,22},
                           {8,16,23,75},
                           {18,91,65,30}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 ==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
