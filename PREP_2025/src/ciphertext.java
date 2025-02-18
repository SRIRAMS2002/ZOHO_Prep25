import java.util.Scanner;

public class ciphertext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the cipher text: ");
        String input = scanner.nextLine().replaceAll("\\s+", ""); // Remove spaces if any
        int length = input.length();

        // Check if length is a perfect square
        int size = (int) Math.sqrt(length);
        if (size * size != length) {
            System.out.println("Error: Length is not a perfect square!");
            return;
        }

        // Create a 2D matrix
        char[][] matrix = new char[size][size];
        int index = 0;

        // Fill the matrix row-wise
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.charAt(index++);
            }
        }

        // Print the matrix row-wise
        System.out.println("\n2D Representation:");
        for (char[] row : matrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        // Read the text column-wise (to get the correct order)
        StringBuilder output = new StringBuilder();
        for (int j = 0; j < size; j++) { // Iterate over columns
            for (int i = 0; i < size; i++) { // Iterate over rows
                output.append(matrix[i][j]);
            }
        }

        // Print the extracted ordered text
        System.out.println("\nCorrect Ordered Text: " + output.toString());

        scanner.close();
    }
}
