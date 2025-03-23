import java.util.*;


public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] statuses = determineStatus(results);

        System.out.println("Scorecard:");
        System.out.println("Student | Physics | Chemistry | Maths | Total | Average | Percentage | Status");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("  %d     |    %d    |    %d     |   %d   |  %.2f  |   %.2f   |   %.2f%%   |   %s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], statuses[i]);
        }
    }

   
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; 


        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40+  ((int) Math.random() * 100); 
            }
        }
        return scores;
    }

   
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; 
    
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }
        return results;
    }

    
    public static String[] determineStatus(double[][] results) {
        int numStudents = results.length;
        String[] statuses = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            if (results[i][2] >= 80) {
                statuses[i] = "Grade A, Above agency Normalised Standard";
            } else if (results[i][2] >= 70) {
                statuses[i] = "Grade B, At agency Normalized Standard";
            } else if (results[i][2] >= 60) {
                statuses[i] = "Grade C, Below but approaching agency Normalized Standard";
            } else if (results[i][2] >= 50) {
                statuses[i] = "Grade D, well Below agency Normalized Standard ";
            }
            else if (results[i][2] >= 40) {
                statuses[i] = "Grade E, too Below agency Normalized Standard ";
            }else {
                statuses[i] = "Remedial Standard";
            }
        }
        return statuses;
    }
}