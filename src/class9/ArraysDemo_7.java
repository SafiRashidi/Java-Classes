package class9;

public class ArraysDemo_7 {
    public static void main(String[] args) {
 // create an array and store 10,20,30,4,5,6,7,80
// add all the element which are multiple of 2

        int[] numbers = {10, 20, 30, 4, 5, 6, 7, 80};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum of elements that are multiples of 2: " + sum);

    }
}
/*
if you wanna check even indexes so we write (i%2==0) i represents the index....
if you wanna check the values of arrays are even or odd we write
(variable name[index]) (numbers[i]% 2==0)
 */