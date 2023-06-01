import java.util.Scanner;
import java.util.Arrays;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(marks);
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
    static void swap(int num1 ,int num2){
        temp = num1;
        num1=num2;
        num2=temp;
        //this change will only be valid in this function scope only .
    }{
        a = 100;
        System.out.println(a);
        //valuea initialized in this block will remain in the block
    }

}
