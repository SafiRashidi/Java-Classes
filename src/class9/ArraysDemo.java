package class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String name = "Slava";
        String name2 = "Slava";
        String name3 = "Slava";
        String name4 = "Slava";
        String name5 = "Slava";
        System.out.println(name2);

        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};

        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[0]);
       // System.out.println(names[500]); error because there is no name on index number 500
        // System.out.println(names[-5]); error because index can't be negative

        for (int i = 0; i <= 5; i++) {
            System.out.println(names[i]);
        }


    }
}
