package class8;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        // 4) Write a program to ask a user to enter item they want to buy and the price of that item.
        // user will be entering multiple items
        // Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        // If user give more money program should return a change.
        // Whenever a user done with payments program should say "Thank you for shopping!"

        /*
        step1: ask user for item price and item name
        step2: accumulate the price
        step3: tell the user how much total that they should pay
        step4: If user give more money program should return a change
        step5: Thank you for shopping
         */

        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice){
            double chang=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+chang);
        }
        System.out.println("Thank you for shopping!");


    }
}
