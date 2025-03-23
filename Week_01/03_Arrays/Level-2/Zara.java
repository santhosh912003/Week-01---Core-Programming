
import java.util.*;


class Zara {
    public static void main(String[] args) {
        int size = 10;
        double[] salary = new double[size];
        double[]  years =  new double[size];
        
        double[] newsalary  = new double[size];
        double[] bonus = new double[size];
        
        double total_bonus = 0;
        double total_salary = 0;
        double total_newsalary = 0;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++){
            
            while(true){
                System.out.println("Enter the salary for the employee "+i+" :");
                double s = sc.nextDouble();
                
                System.out.println("Enter the Years of service for the empployee "+i+" :");
                double y = sc.nextDouble();
                
                
                if(s>=0 || y>=0){
                    years[i] = y;
                    salary[i] = s;
                    break;
                }
            }
        }
        
        for(int i=0;i<size;i++){
          
            if(years[i]>=5){
                bonus[i] = salary[i]*0.05;
                
            }
            else{
                bonus[i] = salary[i] * 0.02;
            }
            
            
            newsalary[i] = salary[i] + bonus[i];
            total_newsalary += newsalary[i];
            total_bonus+=bonus[i];
            total_salary += salary[i];
        }
        
        
        System.out.printf("Total Salary: %.2f | Total Bonus: %.2f | Total New Salary: %.2f\n", total_salary, total_bonus, total_newsalary);

        
        
        
        
    }
}