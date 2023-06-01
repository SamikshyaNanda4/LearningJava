import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //swap numbers code
        swap(a, b);

        System.out.println(a + " " + b);

        String name = " Samikshya Nanda ";
        changeName(name);
        System.out.println(name);
    }

    //PASSED BY VALUE

    static  void changeName(String naam) {
        naam = "CRISTIANO RONALDO";
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

    }


}

