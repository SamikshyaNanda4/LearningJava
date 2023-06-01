import java.util.Scanner;
import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
 //create an array
        int[] arr ={1,3,2,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void change(int[] nums){
        nums[0]=99;
//if you make a change in this obj via reference variable ,same obj will be changed

    }
}
