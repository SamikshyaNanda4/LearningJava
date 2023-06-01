import java.util.Scanner;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(55);
        fun("fifty");

    }
    
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
//the fun()  while overloading runs the specific function at the compile time ,aand
//it chooses by a scheme that either the no of arguments should be diff or arg type should be different .
