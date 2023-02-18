package class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //add method to add elements to this arrayList
        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Zahra");
        names.add("Saba");
        names.add("Daria");
        System.out.println(names);
        names.clear(); // clear => deleting everything from array list
        System.out.println(names);
    }
}
