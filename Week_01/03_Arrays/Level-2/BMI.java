
import java.util.*;


class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of persons: ");
        int n  = sc.nextInt();
        
        double[] h = new double[n];
        double[] w = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        
        for(int i=0;i<n;i++){
            System.out.printf("Enter the weight of the %d person in kg: %n",i+1);
            w[i] = sc.nextDouble();
            System.out.printf("Enter the height of the %d person in m: %n",i+1);
            h[i] = sc.nextDouble();
            
            bmi[i] = w[i]/(h[i]*h[i]);
            
            if(bmi[i]<=18.4){
                status[i] = "UnderWeight";
            }
            else if(bmi[i]>=18.5 && bmi[i]<=24.9){
                status[i] = "Normal";
            }
            else if(bmi[i]>=25 && bmi[i]<=39.9){
                status[i] = "OverWeight";
            }
            else{
                status[i] = "Obese";
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println("\nPerson\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
              System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t%s%n", 
                              (i + 1), h[i], w[i], bmi[i], status[i]);
        }
        sc.close();
    }
}