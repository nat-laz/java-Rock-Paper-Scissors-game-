import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    static int roundsPlayed = 0;
    static int computerWins = 0;
    static int playerWins = 0;
    static int draws = 0;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            System.out.println("===Rock, Paper, Scissors===");
            if (roundsPlayed > 0) showStatistic();

            int playerChoice = handleUserInput(scanner);
            int computerChoice = generateComputerChoice(random);

            playWithComputer(playerChoice, computerChoice);
        }
    }

    /*
        1 - rock
        2 - paper
        3 - scissors
     */
    private static void playWithComputer(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            System.out.println("A draw");
            roundsPlayed++;
            draws++;
            return;
        }

        if (playerChoice == 1) {
            if (computerChoice == 2) handleComputerWin();
            else handlePlayerWin();
        } else if (playerChoice == 2) {
            if (computerChoice == 3) handleComputerWin();
            else handlePlayerWin();
        } else {
            if (computerChoice == 1) handleComputerWin();
            else handlePlayerWin();
        }
    }

    private static int generateComputerChoice(Random random) {
        int computerChoice = random.nextInt(3) + 1;

        switch (computerChoice) {
            case 1 -> System.out.println("Computer throws Rock");
            case 2 -> System.out.println("Computer throws Paper");
            case 3 -> System.out.println("Computer throws Scissors");
        }
        return computerChoice;
    }

    private static int handleUserInput(Scanner s) {
        while (true) {
            System.out.println("Your turn (options: rock, paper, scissors, exit)");

            int playerChoice = switch (s.nextLine().trim().toLowerCase()) {
                case "rock" -> 1;
                case "paper" -> 2;
                case "scissors" -> 3;
                case "exit" -> -1;
                default -> 0;
            };
            if (playerChoice == 0) {
                System.out.println("Wrong input");
            } else if (playerChoice == -1) {
                System.out.println("Bye bye bye");
                System.exit(0);
            } else return playerChoice;

        }
    }

    private static void handlePlayerWin() {
        System.out.println("You win");
        roundsPlayed++;
        playerWins++;
    }

    private static void handleComputerWin() {
        System.out.println("Computer win");
        roundsPlayed++;
        computerWins++;
    }

    private static void showStatistic() {
        System.out.println("Games played: " + roundsPlayed);
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Draws: " + draws);
    }
}