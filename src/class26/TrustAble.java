package class26;

public interface TrustAble {
    int age = 10; // by default, it's public, static and final
    String color = "Blue";
    int trust();

    static void method1() {
        System.out.println("Hello World");
    }

    default void method2 () {

    }

    private void method3 () {

    }
}

class BankOfAmerica implements TrustAble {
    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }
}