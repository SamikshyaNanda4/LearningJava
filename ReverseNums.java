import java.util.Scanner;

public class ReverseNums {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();

        int ans= 0;

        while (n>0){
            int rev = n % 10;
            n = n/10;
            ans = ans * 10 + rev;
        }
        System.out.println(ans);

    }
}
