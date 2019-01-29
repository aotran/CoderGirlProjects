import java.util.Scanner;

import static java.lang.System.out;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Please list three items on your grocery list.");
        out.print("Item 1? ");
        String item1 = keyboard.nextLine();
        out.print("Item 2? ");
        String item2 = keyboard.nextLine();
        out.print("Item 3? ");
        String item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + item1 + "? ");
        int quantity1 = keyboard.nextInt();
        out.print("How many " + item2 + "? ");
        int quantity2 = keyboard.nextInt();
        out.print("How many " + item3 + "? ");
        int quantity3 = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");
        out.print("How much does one " + item1 + " cost? ");
        float cost1 = keyboard.nextFloat();
        out.print("How much does one " + item2 + " cost? ");
        float cost2 = keyboard.nextFloat();
        out.print("How much does one " + item3 + " cost? ");
        float cost3 = keyboard.nextFloat();

        float totalCost = (quantity1 * cost1) + (quantity2 * cost2) + (quantity3 * cost3);

        out.println("Calculating your grocery bill.");
        out.println("Your total cost is $" + totalCost);
    }
}
