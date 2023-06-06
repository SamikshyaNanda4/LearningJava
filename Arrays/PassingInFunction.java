import java.util.Scanner;
import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] num ={3,4,5,6};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
        //mutable behaviour =ARRAYS ARE MUTABLE IN JAVA
        //Strings are immutable in java



    }
    static void change(int[] arr){
        arr[0]=4;
        arr[1]=5;
        arr[2]=6;
        arr[3]=7;
    }
}
