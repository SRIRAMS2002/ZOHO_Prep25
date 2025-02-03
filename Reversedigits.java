// You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

// Examples:

// Input: 200
// Output: 2
// Explanation: By reversing the digits of number, number will change into 2.

import java.util.Scanner;

public class Reversedigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        while (n > 0) {
            int id = n % 10;
            sum = (sum * 10) + id;

            n = n / 10;
        }

        System.out.println("Reverse Digits.. " + sum);
        scanner.close();
    }
}
