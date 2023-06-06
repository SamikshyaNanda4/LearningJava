import java.util.Scanner;



public class Array {

    public static void main(String[] args) {
//Q:sTORE A ROLL.NO/
    int a = 19;

    //Q:Store a persons name
        String name ="Kunal Kushwaha";

        //Q:Store 5 Roll Nos
        int rno1 = 23;
        int rno2 = 56;
        int rno3 = 55;
        int rno4 = 32;
        int rno5 = 12;

        //Q:Store 100 roll no.
        //syntax for 100 rno to be put .here comes Array
        //datatype[] variable_name = new datatype [size];
        //store 10 rnos
        int[] rollno = new int[10];
        //or directly
        int[] rnos ={1,55,78,44,33,22,2,32,43,5};

        int[] rolln;//declaration of array .ros is getting in the stack
        rolln = new int[5];//initialisation :actually here object is being created in the memory
        System.out.println(rolln[4]);

        String[] arr = new String[5];
        System.out.println(arr[4]);




    }
}
