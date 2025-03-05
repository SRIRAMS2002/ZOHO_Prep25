import java.util.Scanner;

public class PascalsTriangle1 {
    public static void main(String[] args) {
        System.out.println("Enter the Number of Rows: ");
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        scanner.close(); // Close scanner after use

        // 2D Array to store Pascal's Triangle
        int[][] pascalTriangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            pascalTriangle[i] = new int[i + 1]; // Create row of size (i + 1)
            pascalTriangle[i][0] = 1; // First element is always 1
            pascalTriangle[i][i] = 1; // Last element is always 1

            // Compute inner elements using Pascal's Triangle formula
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }

        // Print Pascal's Triangle in the required format
        System.out.print("[");
        for (int i = 0; i < numRows; i++) {
            System.out.print("[");
            for (int j = 0; j < pascalTriangle[i].length; j++) {
                System.out.print(pascalTriangle[i][j]);
                if (j < pascalTriangle[i].length - 1) {
                    System.out.print(","); // Add comma for separation
                }
            }
            System.out.print("]");
            if (i < numRows - 1) {
                System.out.print(","); // Add comma for row separation
            }
        }
        System.out.println("]"); // Close main list
    }
}
