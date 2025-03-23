import java.util.Scanner;

public class AtheleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        double perimeter = perimeter(side1,side2,side3);
        int totalRounds = rounds(perimeter);

        System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km.");

        sc.close();
    }
	
	static  double perimeter(double l,double h, double b){
		return l+b+h;
	}
	
	static int rounds(double perimeter){
		int totalRounds = (int) Math.floor(5000 / perimeter);
		
		return totalRounds;
	}
}