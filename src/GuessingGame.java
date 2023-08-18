import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public GuessingGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // Generate a number between 1 and 100

        System.out.println(name + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");

        int tries = 0;

        while (true) {
            int guess = scanner.nextInt();
            tries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Your guess is not within the valid range of 1 to 100. Try again.");
            } else if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done, " + name + "!");
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
        }
    }
}
