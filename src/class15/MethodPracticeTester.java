package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {
        //MethodsDemo2 md = new MethodsDemo2();

        MethodPractice mp=new MethodPractice();
        boolean isEven=mp.isEven(15);
        System.out.println(isEven);

        //call isEven method for the numbers 100 12 20
        boolean isEven2= mp.isEven(100);
        System.out.println(isEven2);

    }
}
