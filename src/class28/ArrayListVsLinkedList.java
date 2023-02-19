package class28;

import java.util.ArrayList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        // linkedList => 45 ms
        // arrayList => 68048

        long startTime = System.currentTimeMillis();
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(0,"Test Data");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
