import java.util.*;

public class Randoms {
    public static void main(String[] args) {
        int size = 5;  
        int[] numbers = generate4DigitRandomArray(size);
        
        System.out.println("Generated numbers: " + Arrays.toString(numbers));

        double[] results = findAverageMinMax(numbers);
        
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;  
        }
        return numbers;
    }

    
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[] {average, min, max};
    }
}
