
import java.util.*;


class UnitConverterExtended2 {
    public static void main(String[] args) {
        
        System.out.print("Converting 98 Fahrenheit to Celsius: ");
        System.out.println(convertFahrenheitToCelsius(98));
        System.out.print("Converting 37 Celsius to Fahrenheit: ");
        System.out.println(convertCelsiusToFahrenheit(37));
        System.out.print("Converting 150 Pounds to Kilograms: ");
        System.out.println(convertPoundsToKilograms(150));
        System.out.print("Converting 68 Kilograms to Pounds: ");
        System.out.println(convertKilogramsToPounds(68));
        System.out.print("Converting 10 Gallons to Liters: ");
        System.out.println(convertGallonsToLiters(10));
        System.out.print("Converting 5 Liters to Gallons: ");
        System.out.println(convertLitersToGallons(5));
        
    }
    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    
    
    
}