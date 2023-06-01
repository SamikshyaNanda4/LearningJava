import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

//         String msg = greet();
//        System.out.println("This is me learning tutorials from Kunal. " + msg);

//        Scanner in = new Scanner(System.in);
        Scanner in =new Scanner(System.in);
        System.out.println("Whats your name?");
        String name =in.next();
        String personalized = greet(name) ;
        System.out.println(personalized);


    }

    static String greet(String name){
        String greeting ="Hello "+ name +".I m here learning fucntions/methods and the return types";
        return greeting;
    }
}
