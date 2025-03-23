import java.util.*;

public class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row for the matrix: ");
        int r = sc.nextInt();
        
        System.out.println("Enter the column for the matrix: ");
        int c = sc.nextInt();
        
        int[][] matrix = new int[r][c];
        
        int val = 1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = val++;
            }
        }
         System.out.println("Given 2D array:");
         for(int[] num: matrix) {
             System.out.println(Arrays.toString(num));
         }
        
        int[] arr = new int[r*c];
        int index = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[index++] = matrix[i][j];
            }
        }
        System.out.println("Converted 1D array:");
        System.out.println(Arrays.toString(arr));
        
        
    }
}