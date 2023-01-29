package class16;

public class Person {
    private double bankBalance=1250000;
    String address="Street 123";//default access level is applied
    public String name="John Snow";

    private void printPhonePassword(){
        System.out.println("pass125");
    }
    void printSSN(){
        System.out.println("123456789");
    }

    public boolean printTikTokAccount (){
        System.out.println("user123");
        return false;
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();
    }

}
