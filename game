import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private int scoreOfPlayer = 0;
    private int scoreOfComputer = 0;
    private int roundsPlayed = 0;


    public String playerChoice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWhat would you like to choose? (Rock, Paper, or Scissors) ");
        String choice = sc.nextLine();


        while (!choice.equalsIgnoreCase("Rock") && !choice.equalsIgnoreCase("Paper") && !choice.equalsIgnoreCase("Scissors")) {
            System.out.println("OOPS! That doesn't work. Please enter a valid choice: (Rock, Paper, or Scissors) ");
            choice = sc.nextLine();
        }
        return choice;
    }


    public String computerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        int choice = rand.nextInt(3);
        return choices[choice];
    }


    public void winner(String playerChoice, String computerChoice) {
        System.out.println("Player chose: " + playerChoice + " & Computer chose: " + computerChoice);

        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) ||
                (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock"))) {
            System.out.println("Hurray! You win this round!");
            scoreOfPlayer++;
        } else {
            System.out.println("Computer wins this round!");
            scoreOfComputer++;
        }
        roundsPlayed++;
    }

    public void displayScores() {
        System.out.println("Total rounds played: " + roundsPlayed);
        System.out.println("The score of the computer is: " + scoreOfComputer);
        System.out.println("The score of the player is: " + scoreOfPlayer);
        System.out.println("-------------------------------");
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");

        boolean continuePlaying = true;

        while (continuePlaying) {

            System.out.println("How many rounds do you want to play?");
            int totalRounds = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= totalRounds; i++) {
                System.out.println("\n--- Round " + i + " ---");
                String playerChoice = playerChoice();
                String computerChoice = computerChoice();
                winner(playerChoice, computerChoice);
                displayScores();
            }

            System.out.println("Would you like to play again? (Y/N)");
            String choice = sc.nextLine();


            while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) {
                System.out.println("OOPS! That doesn't work. Please enter a valid choice (Y/N): ");
                choice = sc.nextLine();
            }

            if (choice.equalsIgnoreCase("N")) {
                continuePlaying = false;
                System.out.println("Game Over!");
                if (scoreOfPlayer > scoreOfComputer) {
                    System.out.println("Congratulations! You are the overall winner!");
                } else if (scoreOfComputer > scoreOfPlayer) {
                    System.out.println("The computer wins the game! Better luck next time.");
                } else {
                    System.out.println("The game is a tie!");
                }
            }
        }
        sc.close();
    }


    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.play();
    }
}
