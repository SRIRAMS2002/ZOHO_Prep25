public class Main {
    public static void main(String[] args) {


        // declares an Array of integers.
        int[] arr1 = {107, 20, 30, 40, 50};



//        hello[] arr ={ 1, "ab" , 2, "abb"}

        hello[] arr = {
                new hello(1, "aman"),
                new hello(2, "vaibhav"),
                new hello(3, "shikar"),
                new hello(4, "dharmesh"),
                new hello(5, "mohit")
        };

        // allocating memory for 5 integers.
//        arr = new int[5];

        // initialize the elements of the array
        // first to last(fifth) element
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;

//        arr = new int[]
//        System.out.println("length" + ":" + arr.length);
//        // accessing the elements of the specified array
//        for (int i = 0; i < arr.length; i++)
//            System.out.println("Element at index "
//                    + i + " : " + arr[i]);
//
//        int[][] arr2 = new int[3][13];


//        // Number of Rows
//        System.out.println("Rows : " + arr2.length);
//
//        // Number of Columns
//        System.out.println("Columns : " + arr2[1].length);

        String[][] arr4 = { { "V", "A", "V","E" }, { "I", "M", "E","V" }, { "K", "L", "C","E" },{ "R", "O", "L","R" } };

        // printing 2D array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(arr4[i][j] + " ");

            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                System.out.print(arr4[j][i]);
            }

        }
        System.out.println();

        int intArray[] = { 1, 2, 3 };

        int cloneArray[] = intArray.clone();
        System.out.println(intArray+"hi");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(
                     intArray[i]);
        }
        System.out.println();
        // will print false as shallow copy is created
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");



        }
    }


}

class hello {
    public int roll_no;
    public String name;

    hello(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}