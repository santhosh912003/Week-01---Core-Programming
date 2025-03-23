
import java.util.*;


class Average2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Students: ");
        int n  = sc.nextInt();
        double[][] data = new double[n][4];
        
        String[] status = new String[n];
        String[] grade = new String[n];
        
        for(int i=0;i<n;i++){
            System.out.printf("Enter the Physics mark of the %d student: %n",i+1);
            data[i][0] = sc.nextDouble();
            System.out.printf("Enter the chemistry mark of the %d student: %n",i+1);
            data[i][1] = sc.nextDouble();
            System.out.printf("Enter the Math mark of the %d student: %n",i+1);
            data[i][2] = sc.nextDouble();
            
            data[i][3] = (data[i][0]+data[i][1]+data[i][2])/3;
            
            double percentage = data[i][3];
            
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
            System.out.println("\nStudent\tPyhsics \tChemistry\t\tMath\t\tAverage\t\tGrade\t\t\tStatus");
              System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\t%s%n", 
                              (i + 1), data[i][0], data[i][1], data[i][2],data[i][3], grade[i],status[i]);
        }
        sc.close();
    }
}