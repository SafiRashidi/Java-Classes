package projects;

public class Project_7 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given number is prime or not?
         */

        /*
        1. number >1
        2. numbers should be divisible only by itself
         */

        int given=5;
        boolean isPrime=true;

        if (given>1){

            for (int i = 2; i <given ; i++) {
                if (given%i==0){
                    isPrime=false;
                    break;
                }
            }
        } else {
            isPrime=false;
        }
        System.out.println("Given number "+given+ " is Prime? " +isPrime);
    }
}
