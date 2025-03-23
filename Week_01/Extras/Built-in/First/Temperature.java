import java.util.*;

public class Temperature{
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for tempearture conversion : ");
        double temp = sc.nextDouble();
        System.out.println("Celsius: " + toCelsius(temp));
        System.out.println("Fahrenheit: " + toFahrenheit(temp));
    }
}