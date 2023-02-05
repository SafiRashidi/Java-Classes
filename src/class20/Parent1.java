package class20;

import javax.imageio.stream.ImageInputStream;

public class Parent1 {

    String name;
    static String lastName;

    /*private Parent1(){
        System.out.println("I am a parent class constructor");
    }*/

    public static void main(String[] args) {

        Parent1 p = new Parent1();
    }
    public void hello (){
        System.out.println("public method hello from parent class");
    }
    protected static void bye(){
        System.out.println("protected method bye from parent class");
    }    private void money(){
        System.out.println("private method money from parent class");
    }
}
