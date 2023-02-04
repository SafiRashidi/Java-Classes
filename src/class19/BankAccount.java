package class19;
// inheritance
public class BankAccount { //parent class or super class or base class

    long accountNumber;
    double money;

    void deposit (){
        System.out.println("Deposit method from Bank account class");
    }
}

class Checking extends BankAccount{ //child class or sub class or derived class

    double interest;
    void transfer (){
        System.out.println("transfer methods from Checking class");
    }
}

class Saving extends BankAccount{

    double profit;

    void takeProfit(){
        System.out.println("profit method from Saving class");
    }
}

class SuperSaving extends Saving{

    void superSaving(){
        System.out.println("Super saving methods from SuperSaving Class");

    }
}