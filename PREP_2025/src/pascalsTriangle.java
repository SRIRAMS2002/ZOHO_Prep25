import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String[] args) {
        //problem no 118

        System.out.println("Enter the Number of Rows : ");

        Scanner scanner = new Scanner(System.in);

        int numRows = scanner.nextInt();

//        System.out.println(numRows);


        for (int i = 0; i < numRows; i++)
        {
            int number = 1;

            // Print initial spaces
            for (int j = 0; j < numRows - i; j++)
            {
                System.out.print("-");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(number + "-");
                number = number * (i - j) / (j + 1);
            }

            for (int j = 0; j < numRows - i; j++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}