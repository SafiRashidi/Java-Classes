package class20;

public class UserClass {
    /*
Write program: userClass  that has a constructor that initializes instance
variable name and mobile number. Create a subclass  userInfo that will have
user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method.
Test your code.
     */

    String name;
    int mobileNum;

    UserClass(String name, int mobileNum){
        this.name = name;
        this.mobileNum = mobileNum;
    }
}
class UserInfo extends UserClass {
    String address;

    UserInfo(String name, int mobileNum, String address){
        super(name, mobileNum);
        this.address = address;
    }
    void userDetails(){
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNum);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
        UserInfo user = new UserInfo("Amber", 658487, "2365 Main St");
        user.userDetails();

        // methods in parent class? - 0
        // methods from the child class? 1

        // ALL CLASSES IN JAVA HAVE a PARENT CLASS
        // who is the parent? - Parent of all classes - IS OBJECT CLASS
    }
}



