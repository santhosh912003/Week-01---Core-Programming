import java.util.*;

public class RockPaperScissor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of games to play: ");
        int rounds = sc.nextInt();
        
        int userWins = 0, computerWins = 0, ties = 0;
        String[][] results = new String[rounds][3];

        for (int i = 0; i < rounds; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = sc.next().toLowerCase();

            String computerChoice = getComputerChoice();
            String result = determineWinner(userChoice, computerChoice);

            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) computerWins++;
            else ties++;

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = result.equals("Tie") ? "Draw" : result + " Wins";
        }

        String[][] stats = calculateStats(userWins, computerWins, ties, rounds);

        displayResults(results, stats);
        sc.close();
    }

    static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int) (Math.random() * 3)];
    }

    static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Tie";

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    static String[][] calculateStats(int userWins, int computerWins, int ties, int totalGames) {
        double userWinPercentage = (userWins * 100.0) / totalGames;
        double computerWinPercentage = (computerWins * 100.0) / totalGames;

        return new String[][] {
            {"Total Games", String.valueOf(totalGames)},
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"Ties", String.valueOf(ties)},
            {"User Win %", String.format("%.2f%%", userWinPercentage)},
            {"Computer Win %", String.format("%.2f%%", computerWinPercentage)}
        };
    }

    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\n========================================");
        System.out.println("          GAME RESULTS TABLE           ");
        System.out.println("========================================");
        System.out.printf("%-10s %-10s %-15s%n", "User", "Computer", "Result");
        System.out.println("----------------------------------------");
        
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-15s%n", row[0], row[1], row[2]);
        }

        System.out.println("\n========================================");
        System.out.println("         GAME STATISTICS TABLE         ");
        System.out.println("========================================");
        for (String[] row : stats) {
            System.out.printf("%-15s : %s%n", row[0], row[1]);
        }
    }
}
