package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';

        if(c=='M'){
            System.out.println("Male");
        }

        String name="Nat";
        // with non-primitive data typs such as String we can't use == symbol
        //like: if(c=="Sam") ==> not working
        if(name.equals("Sam")){
            System.out.println("Amazing student");
        }
    }
}
