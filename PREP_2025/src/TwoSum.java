import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input target
        System.out.print("Enter the target: ");
        int target = scanner.nextInt();
        System.out.print("Enter the target: ");
        scanner.nextLine();
        System.out.println();


        String tar = scanner.nextLine();
        System.out.println("Enter the size of the array: "+ tar);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and input array elements
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find and print the indices
        int[] result = findTwoSum(numbers, target);
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }

        scanner.close();
    }

    // Method to find indices of two numbers that add up to target
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }


            // Store the current number with its index
            map.put(nums[i], i);
        }

        return new int[]{}; // Return an empty array if no pair found
    }
}

