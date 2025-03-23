import java.util.Scanner;

public class StudentVoteChecker{

    public static boolean canStudentVote(int age) {
        
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentAges = new int[10]; 

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = sc.nextInt();
            
            if(age<=0){
                System.out.println("Invalid age.");
                return;
            }
            
            studentAges[i] = age;
        }

        System.out.println("\nVoting Eligibility Results:");
        
        
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") cannot vote.");
            }
        }

        sc.close();
    }
}
