import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
//        int c= in.nextInt();

        //Q:Find the largest of the three numbers .

//        int max = a;
//        if (b > max) {
//            max=b;
//        }if(c > max ){
//            max=c;
//        }
//        System.out.println(max);
//ADDING Math.max for the comparision of two numbers to be maximum
        int maximum =Math.max(a, b);
        System.out.println(maximum);
    }
}
