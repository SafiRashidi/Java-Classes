package class11HW;

public class DogTester {
    public static void main(String[] args) {

        Dog Husky=new Dog();
        Husky.name="Rex";
        Husky.age=6;
        Husky.color="Black";
        Husky.eat();
        Husky.bark();

        Dog Bulldog=new Dog();
        Bulldog.name="Xavi";
        Bulldog.age=8;
        Bulldog.color="White";
        Bulldog.eat();
        Bulldog.bark();

        Dog Labrador=new Dog();
        Labrador.name="Dimo";
        Labrador.age=10;
        Labrador.color="Gray";
        Labrador.eat();
        Labrador.bark();
    }
}
