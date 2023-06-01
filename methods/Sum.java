import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
   int ans = sum2();
        System.out.println("YOUR ANSWER IS: "+ ans);

    }
    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int  sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
       int  sum = num1 + num2;
        System.out.println("sum of the two numbers is: " + sum);
    }
//    access mofdifier(we'll look in OOPS) return_type name(){
     //body
    // return statement;
//}
//
}
