import java.util.*;

public class StudentAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        int[] age = ages(n);
        System.out.println("The random ages of the students are: " + Arrays.toString(age));
        
        String[][] data = trueFalse(age);
        
        System.out.println("==============================================");
        System.out.println("Age of the student\t\tCan Vote");
        
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-15s\t\t%s\n", data[i][0], data[i][1]);
        }

        sc.close();
    }
    
    static int[] ages(int n) {
        int[] age = new int[n];
        for (int i = 0; i < n; i++) {
            age[i] = 10 + (int) (Math.random() * 11); 
        }
        return age;
    }
    
    static String[][] trueFalse(int[] age) {
        String[][] data = new String[age.length][2];
        for (int i = 0; i < age.length; i++) {
            if (age[i] <= 0) {
                System.out.println("Invalid age spotted");
                break;
            } else {
                data[i][0] = String.valueOf(age[i]);
                data[i][1] = (age[i] >= 18) ? "Yes" : "No";
            }
        }
        return data;
    }
}
