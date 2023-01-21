package class11HW;

public class Task3 {
    public static void main(String[] args) {
/*
Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
*/

        String [][] grocery={{"Onion","Potato","Cucumber"},
                            {"Apple","Banana","Orange"},
                            {"Milk","Sour Cream","Kefir"},
                            {"Candies","Chocolate","Buns"}};
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*********************");
        for (String [] arr : grocery) {
            for (String shopping:arr) {
                System.out.print(shopping+" ");
            }
            System.out.println();
        }
    }
}
