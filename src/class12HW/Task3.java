package class12HW;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
/*
Write a program that reads two people's first names and if they
expecting boy or girl? Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
// System.out.println(str.substring(0,27));
 */
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Mom's first name:");
//        String momFirstName= scanner.nextLine();
//        System.out.println("Dad's first name:");
//        String dadFirstName = scanner.nextLine();
//        System.out.println("Boy or Girl");
//        String gender = scanner.nextLine();
//
//        String suggestedName;
//        if (gender.equals("boy")){
//            suggestedName = dadFirstName.substring(0,1) + momFirstName.substring(1);
//        } else if (gender.equals("girl")) {
//            suggestedName = momFirstName.substring(0,1) + dadFirstName.substring(1);
//        } else {
//            suggestedName = "Invalid input";
//        }
//        System.out.println("Suggested baby name: "+ suggestedName);
        System.out.println("*******************************");

        String dadsName="Daniel";
        String momsName="Mary";
        String expectation="girl";
        String firstHalf="";
        String secondHalf="";
        if(expectation.equalsIgnoreCase("boy")){
            firstHalf=dadsName.substring(0,dadsName.length()/2);
            secondHalf=momsName.substring(momsName.length()/2);

        }else {
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(dadsName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);
    }
}
