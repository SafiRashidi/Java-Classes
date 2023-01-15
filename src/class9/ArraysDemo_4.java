package class9;

public class ArraysDemo_4 {
    public static void main(String[] args) {

        // create an array to store the letters A B c d e F.

        char [] letters ={'A','B','c','d','e','F'};
        letters[0]='a'; //updating the element at index 0
        for (char i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }


    }
}
