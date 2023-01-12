package class7;

public class ForLoops_2 {
    public static void main(String[] args) {
        /*
        prints number from 0 to 9
         */

        int number=0;
        while (number<10){
            System.out.println(number);
            number++;
        }
/*
(initialize; condition; increment or decrement)
 */
        System.out.println("************************");
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
        // using a for loop print odd numbers from 1 to 20
        System.out.println("************************");

        for (int abc=0; abc<20; abc+=2){
            System.out.println(abc);
        }

    }
}
