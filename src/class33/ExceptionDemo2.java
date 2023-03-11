package class33;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        System.out.println("Line6");
        try {
            // here we put the code which might throw an error
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException npe){
            System.out.println("We are trying to access a method ona null object");
        } catch (ArithmeticException e) {
            System.out.println("Some one is trying to divide by 0");
        }

        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");
        System.out.println("Line10");
    }
}
