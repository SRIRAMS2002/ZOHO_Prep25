import java.util.Scanner;

public class Group_Anagrams {
    public static void main(String[] args) {

Scanner out = new Scanner(System.in);
System.out.print("Enter the target :");
int target = out.nextInt();

System.out.println(target);

        Scanner scanner = new Scanner(System.in);

        // Ask the user for the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        for(int i=0; i< numbers.length; i++){
            if(target == numbers[i] + numbers[i+1]){
                System.out.println("["+ i + ","+ (i+1) + "]");
            }

        }

    }
}