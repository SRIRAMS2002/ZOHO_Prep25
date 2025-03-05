import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the Number of Rows: ");

        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        scanner.close(); // Close Scanner

        System.out.print("["); // Start of main list

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            System.out.print("["); // Start of row

            for (int j = 0; j <= i; j++) {
                System.out.print(number);
                if (j < i) { // Avoid extra comma at the end
                    System.out.print(",");
                }
                number = number * (i - j) / (j + 1);
            }

            System.out.print("]"); // End of row
            if (i < numRows - 1) { // Avoid extra comma at the end
                System.out.print(",");
            }
        }

        System.out.println("]"); // End of main list
    }
}
