package class20;

public class Child1 extends Parent1{
    public static void main(String[] args) {

        Child1 c1 = new Child1();
        c1.hello();
        c1.bye();
        Parent1.bye();
        Child1.bye();// accessing static method from the parent class using child class name
        // c1.money; 'money()' has private access in a static way by using class name

        c1.name="Gulzhanar";
        Child1.lastName="Berik";
    }
}
