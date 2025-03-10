import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();  // Lowercase variable names (good practice)

        int[] digits = new int[size];

        System.out.println("Enter the Array Elements: ");

        for (int i = 0; i < size; i++) {
            digits[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(digits));

        // Applying Plus One Logic
        int[] result = plusOne(digits);

        // Printing the final result
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Increment the digit and return if no carry needed
                return digits;
            }
            digits[i] = 0;  // If digit is 9, turn it into 0 and continue carry
        }

        // If all digits were 9, create a new array [1,0,0,...]
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}


//compactable soln

//class Solution {
//    public int[] plusOne(int[] digits) {
//        int k = digits.length;
//
//        for (int num = k - 1; num >= 0; num--) {
//
//            if (digits[num] < 9) {
//                digits[num] += 1;
//                return digits;
//            }
//            digits[num] = 0;
//
//
//        }
//
//        int[] newDigits = new int[k + 1];
//        newDigits[0] = 1;
//        // return digits ;
//
//        return newDigits;
//    }
//}