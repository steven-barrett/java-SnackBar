package snackBar;

public class Main
{
    public static void main(String[] args)
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Jane", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        
        int foodID = food.getID();
        Snack chips1 = new Snack("Chips", 1.75, foodID);
        chips1.addQuantity(36);
        Snack chocolateBar2 = new Snack("Chocolate Bar", 1.00, foodID);
        chocolateBar2.addQuantity(36);
        Snack Pretzels3 = new Snack("Pretzels", 2.00, foodID);
        Pretzels3.addQuantity(30);

        int drinkID = drink.getID();
        Snack soda4 = new Snack("Soda", 2.50, drinkID);
        soda4.addQuantity(24);
        Snack water5 = new Snack("Water", 2.75, drinkID);
        water5.addQuantity(20);

        // Test 1
        System.out.println("Test 1");
        soda4.buySnacks(3);
        jane.makePurchase(soda4.getCost() * 3);
        System.out.println("Jane has $" + jane.getCashOnHand() + " left");
        System.out.println("Soda4 left: " + soda4.getQuantity());
        System.out.println("--------------------------------------------------------");

        // Test 2
        System.out.println("Test 2");
        Pretzels3.buySnacks(1);
        jane.makePurchase(Pretzels3.getCost());
        System.out.println("Jane has $" + jane.getCashOnHand() + " left");
        System.out.println("Pretzels3 left: " + Pretzels3.getQuantity());
        System.out.println("--------------------------------------------------------");

        // Test 3 
        System.out.println("Test 3");
        soda4.buySnacks(2);
        bob.makePurchase(soda4.getCost() * 2);
        System.out.println("Bob has $" + bob.getCashOnHand() + " left");
        System.out.println("Soda4 left: " + soda4.getQuantity());
        System.out.println("--------------------------------------------------------");

        // Test 4
        System.out.println("Test 4");
        jane.addCash(10);
        System.out.println("Jane has $" + jane.getCashOnHand() + " left");
        System.out.println("--------------------------------------------------------");

        // Test 5
        System.out.println("Test 5");
        chocolateBar2.buySnacks(1);
        jane.makePurchase(chocolateBar2.getCost());
        System.out.println("Jane has $" + jane.getCashOnHand() + " left");
        System.out.println("chocolateBar2 left: " + chocolateBar2.getQuantity());
        System.out.println("--------------------------------------------------------");

        // Test 6
        System.out.println("Test 6");
        Pretzels3.addQuantity(12);
        System.out.println("Pretzels3 left: " + Pretzels3.getQuantity());
        System.out.println("--------------------------------------------------------");
        
        // Test 7
        System.out.println("Test 7");
        Pretzels3.buySnacks(3);
        bob.makePurchase(Pretzels3.getCost() * 3);
        System.out.println("Bob has $" + bob.getCashOnHand() + " left");
        System.out.println("Pretzels3 left: " + Pretzels3.getQuantity());
        System.out.println("--------------------------------------------------------");

    }
}

