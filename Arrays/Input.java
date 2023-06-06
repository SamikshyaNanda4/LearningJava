import java.util.Arrays;
import java.util.Scanner;
public class Input {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        //array of primitives......................

        int[] arr = new int[5];//total no of index is mentioned here ,so index no =(total.no - 1)
        arr[0]=32;
        arr[1]=54;
        arr[4]=43;
        arr[3]=553;
        arr[4]=34;
        System.out.println("------ choose your number for listing on Array");

        //input using for loops
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
            System.out.println("you choosed :" + arr[i]);
        }
        //way 1 to print
        for (int i = 0; i <arr.length; i++) {
            System.out.print("{ "+ arr[i] +" }");
        }

        System.out.println("");
        //way 2 to print
        for(int num: arr){  //for every element in array the element
            System.out.print(num + " ");//here num represents elements of array
        }
        System.out.println("");
        //way 3 to print

        //array of objects
        String[] str = new String[6];
        for (int i = 0; i <str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[2] = "Samikshya Nanda";
        System.out.println(Arrays.toString(str));


    }
}
