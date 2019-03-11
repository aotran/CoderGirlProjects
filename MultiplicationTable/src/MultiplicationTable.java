import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class MultiplicationTable {

    public static int getNumber() {
        Scanner keyboard = new Scanner(in);
        int number = keyboard.nextInt();
        if (number > 20) { number = 20; }
        return number;
    }

    public static void printMultiples(int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                out.println(i + " * " + j + " = " + i*j);
            }
        }
    }

    public static void main(String[] args) {
        out.println("Welcome to Multiplication Tables");
        out.println("\n" + "How large would you like to see them?");
        printMultiples(getNumber());
    }
}
