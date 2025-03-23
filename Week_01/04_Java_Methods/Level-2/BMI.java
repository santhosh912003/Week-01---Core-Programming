import java.util.Scanner;

public class BMI {

    public static void calculate(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; 
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String[] Status(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter the Person " + (i + 1) + " Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter the Person " + (i + 1) + " Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        calculate(data);
        String[] statuses = Status(data);
        System.out.println();
        
        for (int i = 0; i < data.length; i++) {
            System.out.printf("person %d whose weight is %.2f, height is %.2f, BMI is %.2f, BMI status is %s\n", (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }
}
