
import java.util.*;


class UnitConverter {
    public static void main(String[] args) {
        
        System.out.print("Covertig 10 Km to Miles: ");
        System.out.println(convertKmToMiles(10));
        System.out.print("Converting 10 Miles to KM: ");
        System.out.println(convertMilesToKm(10));
        System.out.print("Coverting 100 meters to feet: ");
        System.out.println(convertMeterToFeet(100));
        System.out.print("Converting 1000 feet to Meters: ");
        System.out.println(convertFeetToMeter(1000));
        
    }
    
    public static double convertKmToMiles(double km){
        return km * 0.621371;
    }
    public static double convertMilesToKm(double miles){
        return miles * 1.60934;
    }
    public static double convertMeterToFeet(double meter){
        return meter *  3.28084;
    }
    public static double convertFeetToMeter(double feet){
        return feet * 0.3048;

    }
    
    
}