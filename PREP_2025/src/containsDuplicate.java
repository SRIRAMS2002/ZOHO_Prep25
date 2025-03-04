import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class containsDuplicate {
    public static void main(String[] args) {
        //ARRAY

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size : ");

        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements");

        for (int i=0; i<size;i++){
            arr[i] = scanner.nextInt();
        }


        System.out.println("Array Elements");

        for(int num : arr){
            System.out.print( num + " ");
        }

        //Remove Duplicates from Sorted Array

        for (int i = 0; i < arr.length - 1; i++) { // Prevent out-of-bounds
            if (arr[i] == arr[i + 1]) {

            }
        }

//        System.out.println("After Array Elements");

//        for(int num : arr){
//            System.out.print( num + " ");
//        }


        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] uniqueArr = IntStream.of(arr).distinct().toArray();

        System.out.println("After Removing Duplicates: " + Arrays.toString(uniqueArr));


        class Solution {
            public int removeDuplicates(int[] nums) {
                if (nums.length == 0) return 0; // Edge case

                int uniqueIndex = 1; // Pointer for unique elements

                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] != nums[i - 1]) {  // If current is not duplicate
                        nums[uniqueIndex] = nums[i]; // Move unique element forward
                        uniqueIndex++;
                    }
                }

                return uniqueIndex; // Unique count
            }
        }


    }
}

