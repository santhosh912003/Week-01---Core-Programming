
import java.util.*;


class UnitConverterExtended {
    public static void main(String[] args) {
        
        System.out.print("Covertig 10 Yards to Feet: ");
        System.out.println(convertYardsToFeet(10));
        System.out.print("Converting 10 Feet to Yards: ");
        System.out.println(convertFeetToYards(10));
        System.out.print("Coverting 100 meters to Inches: ");
        System.out.println(convertMeterToInches(100));
        System.out.print("Converting 1000 Inches to Meters: ");
        System.out.println(convertInchesToMeter(1000));
        System.out.print("Converting 1000 Inches to CentiMeters: ");
        System.out.println(convertInchesToCm(1000));
        
    }
    
    public static double convertYardsToFeet(double yards){
        return yards * 3;
    }
    public static double convertFeetToYards(double feet){
        return feet * 3.3333;
    }
    public static double convertMeterToInches(double meter){
        return meter *  39.3701;
    }
    public static double convertInchesToMeter(double inches){
        return inches * 0.0254;
    }
    public static double convertInchesToCm(double inches){
        return inches * 0.3048;
    }
    
    
}