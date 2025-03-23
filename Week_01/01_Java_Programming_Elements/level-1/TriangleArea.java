import java.util.*;

class TriangleArea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
       System.out.print("Enter base of the triangle (in cm): ");
       double base = sc.nextDouble();

       System.out.print("Enter height of the triangle (in cm): ");
       double height = sc.nextDouble();

       double areaCm = 0.5 * base * height;
       double areaInches = areaCm * 0.155;

       System.out.printf("The area of triangle in cm is %.2f and in inches is %.2f", areaCm, areaInches);
      


       sc.close();

        
    }
}