import java.util.*;

public class Statistics{
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        System.out.println("Heights of the players: " + Arrays.toString(heights));
        System.out.println("Shortest height: " + Shortest(heights) + " cm");
        System.out.println("Tallest height: " + Tallest(heights) + " cm");
        System.out.println("Mean height: " + Mean(heights) + " cm");
    }

    static int Sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    static double Mean(int[] arr) {
        return Sum(arr) / (double) arr.length;
    }

    static int Shortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static int Tallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
