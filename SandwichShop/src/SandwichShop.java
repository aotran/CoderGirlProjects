import java.util.Scanner;

import static java.lang.System.out;

public class SandwichShop {
    public static void main(String[] args) {
        // Establishing scanner
        Scanner keyboard = new Scanner(System.in);

        // Initializing food items and goal variables
        String[] foodItems = {"veggie sandwiches", "burgers", "subs", "soup"};
        int[] salesGoals = {50, 250, 180, 70};
        boolean dailyGoal = true;

        out.println("Check sales goals.");
        // for length in array, check
        for (int i = 0; i < foodItems.length; i++) {
            out.println("The sales goal for " + foodItems[i] + " is " + salesGoals[i]);
            out.println("How many " + foodItems[i] + " were sold today?");
            int sales = keyboard.nextInt();
            keyboard.skip("\n");
            if (sales >= salesGoals[i]) {
                out.println("Made goal for " + foodItems[i]);
            } else {
                out.println("Fell short");
                dailyGoal = false;
            }
        }
        if (dailyGoal) {
            out.println("Made goal for everything!");
        }
    }
}
