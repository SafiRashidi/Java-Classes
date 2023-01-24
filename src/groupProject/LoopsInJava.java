package groupProject;
/*
Loop help us repeat instruction in code for example if we have to print the
numbers from 1 to 100, one way we can do this is by copying and pasting the code
which is bad and not scalable other way of doing this is using loops.
4 types of loops:
    1)while
    2) do while
    3) for loop
    4) enhanced for loop.
 */
public class LoopsInJava {
    public static void main(String[] args) {

// A "while" loop checks the condition before executing the loop body.
// If the condition is false, the loop is not executed at all.
        //1- While
        int number = 0;
        while (number < 10){ //Keeps on checking the condition as long as it returns true
            System.out.println("Hello world");
            number++; // increment the number by one
        }
        System.out.println("----------------- Do While Loop -----------------");
        // 2- Do while
        //A "do-while" loop, on the other hand, always executes the loop body at least once, and then checks the condition.
        // If the condition is true, the loop continues to execute, otherwise it stops.
        int count = 0;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5);
/*
In this example, the loop body will execute at least once (printing "Count: 0"), and then the condition (count < 5)
will be checked. If the condition is true, the loop will execute again. The loop will continue to execute until
the condition is false (when count is no longer less than 5).
*/
        System.out.println("------------------- For Loop --------------------");
        // 3- For Loop
      //(initialize; condition; increment or decrement)
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
        /*When you know exactly how many times you want to
        loop through a block of code, use the For Loop
        instead of While Loop;
        when we don't know how many times we need to repeat
        a block of code we should be going with While Loop
        most of the time it happens when the user input is involved.
         */
        System.out.println("---------------- Enhanced Loop ---------------------");
        // 4- Enhanced Loop
/*
In Java, the "enhanced for loop" (also known as the "for-each loop") is a type of loop that is used to iterate
over the elements of an array or a collection. It is called an "enhanced" loop because it is a more concise
and easy-to-read version of the traditional "for loop" that is used to iterate over arrays or collections.
 */
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
