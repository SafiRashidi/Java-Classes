package class11HW;

public class Task2 {
    public static void main(String[] args) {
       /*
       Create 2D array of cars : american, german, korean, italian.
       Then retrieve all values from that array using 2 different loops
        */

        String [][] cars= {{"Ford","GMC","Chevy"},
                          {"Mercedez","Audi","BMW"},
                          {"KIA","Hyundai","SsanYong"},
                          {"Ferrari","Maserati","Lambo","FIAT"}};
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("******************************");


        for (String[] arr:cars) {
            for (String models:arr) {
                System.out.print(models+" ");
            }
            System.out.println();
        }
    }
}
