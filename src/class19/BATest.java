package class19;

public class BATest {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.accountNumber=789462878;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //ba.transfer(); methods defined inside child class not available to the parent class

        System.out.println("--- Creating an object from checking account ---");

        Checking check = new Checking();
        //features from parent
        check.accountNumber=459875;
        check.money=7889;
        // features from checking class itself
        check.interest=0;

        check.deposit(); // from parent
        check.transfer(); // from child

        System.out.println("--- Creating an Object of Saving account ---");

        Saving save = new Saving();
        save.accountNumber=8798545;
        save.money=12000;
        save.profit=100;
        //save.interest=0; error; siblings features are not available

        save.deposit(); // from parent
        save.takeProfit(); // comes from saving
        //save.transfer(); not available

        // finish creating SuperSaving object and see which feature available to that class
    }
}
