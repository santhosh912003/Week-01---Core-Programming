import java.util.Scanner;

public class YoungetTallest {

    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                minIndex = i;
            }
        }
        return names[minIndex];
    }


    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];      
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            int a = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            double h = sc.nextDouble();
            if(a<=0||h<=0){
                System.out.println("Invalid height or age.");
                return;
            }
            
            ages[i]=a;
            heights[i] = h;
            
        }

        
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        System.out.println("\nResults:");
        System.out.println("The youngest among the friends is: " + youngest);
        System.out.println("The tallest among the friends is: " + tallest);

        sc.close();
    }
}
