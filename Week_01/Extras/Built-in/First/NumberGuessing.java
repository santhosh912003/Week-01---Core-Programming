import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        
        playGame();
        
    }

    static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        System.out.println("Think of a number between " + low + " and " + high + ". I'll try to guess it!");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (higher/lower/correct)");

            String response = sc.nextLine().trim().toLowerCase();
            
            if (response.equals("correct")) {
                System.out.println("Great! I guessed your number: " + guess);
                break;
            } else if (response.equals("lower")) {
                high = guess - 1;
            } else if (response.equals("higher")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid response. Please reply with 'higher', 'lower', or 'correct'.");
            }
        }
         sc.close();
    }

    static int generateGuess(int low, int high) {
        Random rand = new Random();
        return low + rand.nextInt(high - low + 1);
    }
}
