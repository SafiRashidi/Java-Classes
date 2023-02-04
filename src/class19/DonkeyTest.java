package class19;

public class DonkeyTest {
    public static void main(String[] args) {

        // Donkey donkey = new Donkey();//default constructor creates by the compiler when a programmer does not create one

        Donkey donkey = new Donkey("Pepper",3);//the moment YOU create a constructor compiler does not give any DEFAULT constructor
        donkey.print();
    }
}
