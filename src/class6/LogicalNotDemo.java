package class6;

public class LogicalNotDemo {
    public static void main(String[] args) {


        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String pass="Pass1234";
        System.out.println(pass.equals("Pass123"));
        if(!pass.equals("Pass123")){
            System.out.println("Wrong password");
        }

        boolean isRaining=true;
        if(!isRaining){
            System.out.println("Lets go for a walk");
        }else{
            System.out.println("Lets take the umbrella");
        }

    }
}
