package class29;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
// 2)Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList <String> cars = new ArrayList<>();
        cars.add("BMW Xi");
        cars.add("Tesla Y");
        cars.add("FX");
        System.out.println(cars);
        for (String car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            System.out.println(car);
        }
    }
}
