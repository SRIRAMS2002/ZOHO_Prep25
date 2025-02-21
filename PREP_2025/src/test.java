import java.util.Arrays;
import java.util.Scanner;
//Remove Element subs
public class test {
    public static void main(String[] args) {
        System.out.println("HI");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value ");

        int val = scanner.nextInt();


        System.out.println("Enter the size ");

        int size = scanner.nextInt();

        System.out.println(" size of nums" + size);

        String[] arr = new String[size];

        for (int i=0; i<size ; i++){
            System.out.print(" Ele" + " "+(i+1)+ ":");
             arr[i] = String.valueOf(scanner.nextInt());
             System.out.println();

        }

//        for(int num : arr){
//            System.out.print("Array: " + num + "");
//        }
//
        System.out.println("Array: " + Arrays.toString(arr));

//for(int num :arr){
//    if(val == arr[num]){
//        arr[num]= 0;
//    }
//}
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(String.valueOf(val))){
                arr[i]= "_";
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));

        scanner.close();


    }
}