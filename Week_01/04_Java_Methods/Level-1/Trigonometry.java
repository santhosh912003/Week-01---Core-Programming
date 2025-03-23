import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        
        double[] results = calculateTrigonometricFunctions(angle);
        
        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);

        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double Sine = Math.sin(radians);
        double Cos = Math.cos(radians);
        double Tan = Math.tan(radians);
        
        return new double[] {Sine,Cos,Tan};
        
    }

    
}