
import java.util.*;


class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Students: ");
        int n  = sc.nextInt();
        
        double[] phy = new double[n];
        double[] chem = new double[n];
        double[] mat = new double[n];
        double[] perc = new double[n];
        String[] status = new String[n];
        String[] grade = new String[n];
        
        for(int i=0;i<n;i++){
            System.out.printf("Enter the Physics mark of the %d student: %n",i+1);
            phy[i] = sc.nextDouble();
            System.out.printf("Enter the chemistry mark of the %d student: %n",i+1);
            chem[i] = sc.nextDouble();
            System.out.printf("Enter the Math mark of the %d student: %n",i+1);
            mat[i] = sc.nextDouble();
            
            perc[i] = (mat[i]+phy[i]+chem[i])/3;
            
            double percentage = perc[i];
            
        if (percentage >= 80) {
            grade[i] = "A";
            status[i] = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade[i] = "B";
            status[i] = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade[i] = "C";
            status[i] = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade[i] = "D";
            status[i] = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade[i] = "E";
            status[i] = "Level 1-, too below agency-normalized standards";
        } else {
            grade[i] = "R";
            status[i] = "Remedial standards";
        }
        }
        
        for(int i=0;i<n;i++){
            System.out.println("\nStudent\tPyhsics \tChemistry\t\tMath\t\tAverage\t\tStatus");
              System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t%s\t%s%n", 
                              (i + 1), phy[i], chem[i], mat[i],perc[i],grade[i], status[i]);
        }
        sc.close();
    }
}