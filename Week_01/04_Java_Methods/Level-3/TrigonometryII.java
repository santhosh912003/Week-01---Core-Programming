
import java.util.*;

public class TrigonometryII {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y2: ");
        int y2 = sc.nextInt();
        System.out.println("Enter the value of x3: ");
        int x3 = sc.nextInt();
        System.out.println("Enter the value of y3: ");
        int y3 = sc.nextInt();
        
        
        System.out.println("The slope of AB: ");
        double slope_ab = slope(x1,y1,x2,y2);
        System.out.println(slope_ab);
        System.out.println("The slope of BC: ");
        double slope_bc = slope(x2,y2,x3,y3);
        System.out.println(slope_bc);
        System.out.println("The slope of AC: ");
        double slope_ac = slope(x1,y1,x3,y3);
        System.out.println(slope_ac);
        
        
        System.out.println("The given points are collinear: " + collinear(slope_ab,slope_bc,slope_ac));
        
        System.out.println("The given points are collinear by area: " + collinearByArea(x1,x2,x3,y1,y2,y3));
        
    }
    
    static boolean collinear(double a,double b, double c){
        if(a==b && a==c && b==c){
            return true;
        }
        return false;
    }
    
    static double slope(int x1,int y1, int x2, int y2){
        return (x2-x1)/(y2-y1);
    }
    
    static boolean collinearByArea(int x1,int x2, int x3, int y1, int y2, int y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area==0.0;
    }
}