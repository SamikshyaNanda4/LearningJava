import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class MultiDimention {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        //multidimentional arrays starting from 2D arrays

        // 1 2 3
        // 4 5 6      MartiX Arrays
        // 7 0 2

        int[][] arr = new int[3][3]; //adding the rows is mandatory

//        int[][] arr2D={
//                [1,3,4],
//               [34,5,3],
//              [12,34,54]
//        };

        //input
        for (int row = 0; row < arr.length ; row++) {

            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=in.nextInt();
            }

        }
        //output
        for (int row = 0; row < arr.length ; row++) {

            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row] [col] + " ");
            }
            System.out.println(" ");

        }

        //output 2
        for (int row = 0; row < arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }


        //output
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
