
import java.sql.SQLOutput;
import  java.util.Scanner;
public class Switch {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
//        String fruit =in.next();
//
//        switch (fruit){
//            case "Mango":
//                System.out.println("King Of All Fruits!");
//                break;
//            case "Apple":
//                System.out.println("A Day ,Keeps The Doctor Away!");
//                break;
//            case"Grapes":
//                System.out.println("Friends of berries but are more sweet !");
//            case "Banana":
//                System.out.println("Pottasium filled Pre Workout for the Gym goers!");
//                break;
//            case "Pomegranate":
//                System.out.println("Best pre workout which causes blood flow !");
//                break;
//            case "Orange":
//                System.out.println("Are Particularly exported from Cold Regions!");
//                break;
//                default:
//                    System.out.println("Please Enter a valid Fruit");
//        }
        int day =in.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }
}
