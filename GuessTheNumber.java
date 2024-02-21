import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;
        int randomNumber;
        char playAgain = 'y';
        
        while (playAgain == 'y' || playAgain == 'Y') {
            // Generate random number
            randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I have generated a number between " + minRange + " and " + maxRange + ". Guess the number!");

            // Reset attempts for each round
            attempts = 0;
            
            // Start guessing
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
