import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the variable : ");

        int val = scanner.nextInt();

        System.out.println("Enter the size of the Array : ");

        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the  Array : ");


        for(int num=0; num<size;num++){
            arr[num] = scanner.nextInt();
        }

        //condition

        int count=0;
        for(int nums: arr){
            if(nums == val) count++;
        }

        int[] newarr = new int[size - count];

int i=0;
for(int num : arr){
    if(arr[i]!=num)
        newarr[i++] = num;

}

        System.out.print("The Arrays : "  + Arrays.toString(arr));
        System.out.print("  ");
        System.out.print("The Arrays : "  + Arrays.toString(newarr));



    }
}
//alter
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // Pointer for inserting non-matching values

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // New length of the array after removal
    }
}
