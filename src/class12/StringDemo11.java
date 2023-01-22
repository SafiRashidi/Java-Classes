package class12;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Send it to support channel. More Java";
        // returns the new String from this index
        String newStr=str.substring(5);
        System.out.println(newStr);

        // we can also specify the starting point and the ending point
        System.out.println(str.substring(0,27));

    }
}
