import java.util.*;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Amount : ");
        double p = sc.nextDouble();
        
        System.out.println("Enter the rate of interest: ");
        double r = sc.nextDouble();
        
        System.out.println("Enter the number of years: ");
        double n = sc.nextDouble();
        
        double si = si(p,n,r);
        
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f years",si,p,r,n);
    }
    
    static double si(double p,double n, double r){
        double amt = (p*n*r)/100;
        return amt;
    }
}