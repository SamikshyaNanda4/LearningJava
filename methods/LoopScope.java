import java.util.Scanner;
import java.util.Arrays;

public class LoopScope {
    public static void main(String[] args) {

        int a =100;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            a=100000;
            int num=10;
        }
        System.out.println(a);

        int num =50;
        System.out.println(num);

    }
}
