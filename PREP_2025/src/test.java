import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        //ARRAY INIT

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array Size : ");

        int size =scanner.nextInt();
        int[] arr = new  int[size];
System.out.println("The Elements are");
        for (int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print("The Array : [");
        for (int num : arr){
            System.out.print("["+num  + "] ");
        }
    }
}