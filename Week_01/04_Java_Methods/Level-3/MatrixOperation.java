import java.util.*;

public class MatrixOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        if ((rows == 2 && cols == 2) || (rows == 3 && cols == 3)) {
            int[][] matrix1 = generateRandomMatrix(rows, cols);
            int[][] matrix2 = generateRandomMatrix(rows, cols);

            System.out.println("Matrix 1:");
            displayMatrix(matrix1);
            System.out.println("Matrix 2:");
            displayMatrix(matrix2);

            System.out.println("Addition of Matrices:");
            displayMatrix(addMatrices(matrix1, matrix2));

            System.out.println("Subtraction of Matrices:");
            displayMatrix(subtractMatrices(matrix1, matrix2));

            System.out.println("Multiplication of Matrices:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));

            if (rows == 2) {
                System.out.println("Determinant of Matrix 1:");
                System.out.println(findDeterminant2x2(matrix1));

                System.out.println("Inverse of Matrix 1:");
                double[][] inverse = findInverse2x2(matrix1);
                if (inverse != null) {
                    displayMatrix(inverse);
                }
            } else if (rows == 3) {
                System.out.println("Determinant of Matrix 1:");
                System.out.println(findDeterminant3x3(matrix1));

                System.out.println("Inverse of Matrix 1:");
                double[][] inverse = findInverse3x3(matrix1);
                if (inverse != null) {
                    displayMatrix(inverse);
                }
            }
        } else {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
        }
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Generates random numbers between 0 and 9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix2[0].length, common = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int findDeterminant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static double[][] findInverse2x2(int[][] matrix) {
        int determinant = findDeterminant2x2(matrix);
        if (determinant == 0) {
            System.out.println("Inverse doesn't exist (determinant is 0)");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    public static int findDeterminant3x3(int[][] matrix) {
        int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                        - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                        + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return determinant;
    }

    public static double[][] findInverse3x3(int[][] matrix) {
        int determinant = findDeterminant3x3(matrix);
        if (determinant == 0) {
            System.out.println("Inverse doesn't exist (determinant is 0)");
            return null;
        }
        double[][] inverse = new double[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) determinant;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) determinant;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) determinant;
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) determinant;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) determinant;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) determinant;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) determinant;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) determinant;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) determinant;
        return inverse;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) return;
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
}

