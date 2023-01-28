package projects;

public class Project_6 {
    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a temporary variable?
        int a=20;
        int b=50;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a=" + a + ", b=" + b);
    }
}
