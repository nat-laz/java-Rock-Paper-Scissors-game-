import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Rock = 1
     * Paper = 2
     * Scissors = 3
     */
    public static void main(String[] args) {

    }

    public static int getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        int playerChoice = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Enter your choice (Rock[1], Paper[2], or Scissors[3]): ");
            playerChoice = scanner.nextInt();

            if (playerChoice >= 1 && playerChoice <= 3) {
                isValid = true;
            } else {
                System.out.println("Invalid choice. Please enter 1 for Rock, 2 for Paper, or 3 for Scissors.");
            }
        }

        return playerChoice;
    }

    public static int getComputerChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static String determineRoundWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return "It's a tie!";
        }

        if ((playerChoice == 1 && computerChoice == 3) ||  // Rock crushes Scissors
                (playerChoice == 2 && computerChoice == 1) ||  // Paper covers Rock
                (playerChoice == 3 && computerChoice == 2)) {  // Scissors cuts Paper
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }

    public static String convertChoiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "";
        }
    }

    public static void playRounds(int numberOfRounds) {

    }

    public static void displayChoices(String playerChoice, String computerChoice) {


    }

    public static void displayRoundResult(String result) {

    }

    public static void displayFinalScore(int playerScore, int computerScore, int roundsPlayed) {

    }

    public static void trackScore(String roundResult, int[] scores) {

    }

    public void displayGameMenu() {
        System.out.println("Welcome to the Game!");
        System.out.println("1. Start the game. ");
        System.out.println("2. Exit the game. ");
    }
}