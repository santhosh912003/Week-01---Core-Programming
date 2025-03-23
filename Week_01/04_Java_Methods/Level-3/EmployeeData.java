import java.util.*;

public class EmployeeData {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        double[][] old_data = new double[10][2];
        double[][] new_data = new double[10][2];
        
        
        getData(old_data);
        getNewData(old_data,new_data);
        
        double[] data = sum(old_data,new_data);
        System.out.println("Employees\t\tOld_salary\t\tnew_salary\t\tbonus");
        System.out.printf("10\t\t\t\t%.2f\t\t%.2f\t\t%.2f",data[0],data[2],data[1]);
        
        
    }
    
    static double[] sum(double[][] old, double[][] newdata){
        double old_sal = 0;
        double bonus = 0;
        double new_sal = 0;
        
        for(int i=0;i<10;i++){
            old_sal += old[i][0];
            new_sal += newdata[i][1];
            bonus += newdata[i][0];
            
        }
        
        return new  double[] {old_sal, bonus, new_sal};
    }
    
    static double bonus( double y,double a){
        if(y<5){
            return 0.02 * a;
        }
        else{
            return 0.05 * a;
        }
    }
    
    static void getNewData(double[][] old_data,double[][] new_data){
        for(int i=0;i<10;i++){
            double b = bonus(old_data[i][1],old_data[i][0]);
            double new_sal = old_data[i][0] + b;
            
            new_data[i][0] = b;
            new_data[i][1] = new_sal;
        }
        
        return;
    }
    
    
    static void getData(double[][] old_data){
        for(int i=0;i<10;i++){
            double salary = 10000 + (int)(Math.random() * 99999);
            double years = 1 + (int) (Math.random() * 10);
            old_data[i][0] = salary;
            old_data[i][1] = years;
        }
        return ;
    } 
}