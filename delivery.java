import java.util.regex.*;
import java.util.Scanner;


// based on lieferando system
public class delivery {
    public static void main(String[] args) {

        System.out.println("Enter your order: ");


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        Pattern burgerP = Pattern.compile("(Burger|burger)");
        Pattern fantaP = Pattern.compile("(Fanta|fanta)");
        Pattern chickenburgerP = Pattern.compile("(Chickenburger|chickenburger)");
        Pattern cheeseburgerP = Pattern.compile("(Cheeseburger|cheeseburger)");

        Matcher burgerMatch = burgerP.matcher(input);
        Matcher fantaMatch = fantaP.matcher(input);
        Matcher chickenburgerMatch = chickenburgerP.matcher(input);
        Matcher cheeseburgerMatch = cheeseburgerP.matcher(input);

        float serviceFee = 0.50f; // Servicegebühr 0,50euro
        float Deliveryfee = 2.50f; // Lieferkosten 2,50euro
        float burger = 3.00f;
        float fanta = 4.00f;
        float chickenburger = 5.00f;
        float cheeseburger = 6.00f;
        float kebab = 7.00f;
        float pizza = 8.00f;
        float schnitzel = 9.00f;
        int FreeDelivery = 15; // Free delivery for orders over 15euro like the actual one

// order system needs rework for free delivery
        if (burgerMatch.matches()) {
            System.out.println("You have ordered a Burger");
            System.out.println("Hamburger: " + burger + "€");
            System.out.println("Delivery Fee: " + Deliveryfee + "€");
            System.out.println("Service Fee: " + serviceFee + "€");

            System.out.println("Total: " + (burger + Deliveryfee + serviceFee)+ "€");

        } else if (fantaMatch.matches()) {
            System.out.println("You have ordered a Fanta");
            System.out.println("Fanta: " + fanta + "€");
            System.out.println("Delivery Fee: " + Deliveryfee + "€");
            System.out.println("Service Fee: " + serviceFee + "€");
            System.out.println("Total: " + (fanta + Deliveryfee+ serviceFee)+ "€");
        } else if (chickenburgerMatch.matches()) {
            System.out.println("You have ordered a Chickenburger");
            System.out.println("Chickenburger: " + chickenburger + "€");
            System.out.println("Delivery Fee: " + Deliveryfee + "€");
            System.out.println("Service Fee: " + serviceFee + "€");
            System.out.println("Total: " + (chickenburger + Deliveryfee+ serviceFee)+ "€");
        } else if (cheeseburgerMatch.matches()) {
            System.out.println("You have ordered a Cheeseburger");
            System.out.println("Cheeseburger: " + cheeseburger + "€");
            System.out.println("Delivery Fee: " + Deliveryfee + "€");
            System.out.println("Service Fee: " + serviceFee + "€");

            System.out.println("Total: " + (cheeseburger + Deliveryfee+ serviceFee)+ "€");
        } else {
            System.out.println("Invalid Input");
        }


    }
}
