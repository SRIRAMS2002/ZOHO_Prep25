// Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

//     A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
//     Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

// Examples :

// Input: n = 12
// Output: 2
// Explanation: 1, 2 when both divide 12 leaves remainder 0.

import java.util.Scanner;

public class Solution {
    public static int evenlyDivides(int n) {
        int count = 0;
        int num = n;
        
        while (n > 0) {
            int value = n % 10;
            if (value != 0 && num % value == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
      
        int result = evenlyDivides(n);
        
        System.out.println("Count of digits that evenly divide " + n + ": " + result);
        scanner.close();
    }
}
