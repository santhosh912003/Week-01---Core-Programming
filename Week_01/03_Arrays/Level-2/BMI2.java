
import java.util.*;


class BMI2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of persons: ");
        int n  = sc.nextInt();
        
        double[][] data = new double[n][3];
        String[] status = new String[n];
        
        for(int i=0;i<n;i++){
            System.out.printf("Enter the weight of the %d person in kg: %n",i+1);
            data[i][0] = sc.nextDouble();
            System.out.printf("Enter the height of the %d person in m: %n",i+1);
            data[i][1] = sc.nextDouble();
            
            double bmi = data[i][0]/(data[i][1]*data[i][1]);
            data[i][2] = bmi;
            
            
            if(bmi<=18.4){
                status[i] = "UnderWeight";
            }
            else if(bmi>=18.5 && bmi<=24.9){
                status[i] = "Normal";
            }
            else if(bmi>=25 && bmi<=39.9){
                status[i] = "OverWeight";
            }
            else{
                status[i] = "Obese";
            }
            
        }
        
        for(int i=0;i<n;i++){
            System.out.println("\nPerson\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
              System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t%s%n", 
                              (i + 1), data[i][1], data[i][0], data[i][2], status[i]);
        }
        sc.close();
    }
}