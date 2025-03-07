import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.print("Enter the arr size :");

        Scanner scanner = new Scanner(System.in);

        int size  = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Array Elements :");
        for (int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        int k=0;

        for(int i=0; i< size ;i++){
            if (k < size-1 && arr[k] != arr[i]) {
                arr[k] ^= arr[i];

            }






        }
        System.out.print(arr[k] + " ");
        scanner.close();
    }
}