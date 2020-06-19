/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5testproject;
import java.util.*;
/**
 *
 * @author jlsin, Antonio
 */
public class Lab5TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BurgerOrder order1 = new BurgerOrder(3,5,4,10, false,1);
        //BurgerOrder order2 = new BurgerOrder(0,0,3,3,true,2);
        //BurgerOrder order3 = new BurgerOrder(1,1,0,2,false, 3);
        
        //System.out.println(order1);
        //System.out.println(order2);
        //System.out.println(order3);
        //order1.setNumSodas(12);
        //System.out.println(order1);
        FastFoodKitchen kitchen = new FastFoodKitchen(); //creates new FastFoodKitchen object
        Scanner sc = new Scanner(System.in); //prints new scanner
        while (kitchen.getNumOrdersPending() != 0) { //while pending number of orders does not equal 0
        // see if user wants to add an order
        System.out.println("Please select from the following menu of options, by typing a number:");
        System.out.println("\t 1. Order food");
        System.out.println("\t 2. Check on an order");         
        System.out.println("\t 3. Show all the orders currently pending.");
        System.out.println("\t 4. Do nothing (just waiting)");
        System.out.println("\t 5. Cancel order");
        //checks to ensure no inputs result in an error
        try {
        int num = sc.nextInt();
        switch (num) {
        //user orders, choosing how many hamburgers/cheeseburgers/veggieburgers/sodas they want
        case 1:
        System.out.println("How many hamburgers do you want?");
        int ham = sc.nextInt();
        System.out.println("How many cheeseburgers do you want?");
        int cheese = sc.nextInt();
        System.out.println("How many veggieburgers do you want?");
        int veggie = sc.nextInt();
        System.out.println("How many sodas do you want?");
        int sodas = sc.nextInt();
        System.out.println("Is your order to go? (Y/N)");
        char letter = sc.next().charAt(0);
        boolean TOGO = false;
        if (letter == 'Y' || letter == 'y' ) {
            TOGO = true;
        }
        //gives order number
        int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
        System.out.println("Thank-you. Your order number is " + orderNum);
        System.out.println();
        break;
        //user checks their order
        case 2:
        System.out.println("What is your order number?");
        int order = sc.nextInt();
        boolean ready = kitchen.isOrderDone(order);
        if (ready) {
            System.out.println("Yes, we already called out order number " + order);
        }
         else {
            System.out.println("No, it's not ready, but it should be up soon. Sorry for the wait.");
        }
        System.out.println();
        break;
        //user checks number of pending orders
        case 3:
            System.out.println("There are currently " + kitchen.getNumOrdersPending() + " orders pending");
            break;
        //user waits
        case 4:
            break;
        case 5:
        //user cancels order
            System.out.println("Enter order ID you wish to cancel: ");
            int orderID = sc.nextInt();
            boolean valid = kitchen.cancelOrder(orderID);
            if (valid)
                System.out.println("Your order has been successfully cancelled");
            else
                System.out.println("Sorry, we can’t find your order number in the system");
            break;
        default: System.out.println("Sorry, but you need to enter a 1, 2, 3, 4, or a 5");
        }
        } catch (InputMismatchException ime) {
            System.out.println("Sorry, but that wasn't a number.");
        }
        // simulate cooking activity in the kitchen
        kitchen.simulateKitchenActivity();       
        } // end while loop
    }
    
}