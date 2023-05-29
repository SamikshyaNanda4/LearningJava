import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int empID = in.nextInt();
String department = in.next();


switch(empID){
    case 01 -> {
        System.out.println("Samikshya Nanda");
        switch(department){
            case "IT" -> System.out.println("IT Department");
            case "HR" -> System.out.println("not in HR Department");
            case "Management" -> System.out.println("not in Management Department");
            case "Core" -> System.out.println("not in Core Manufacture Department");
        }
    }
    case 02 -> {
        System.out.println("Dhiroj Ku Sahu");
        switch(department){
            case "IT" -> System.out.println("not IT Department");
            case "HR" -> System.out.println("HR Department");
            case "Management" -> System.out.println("not in Management Department");
            case "Core" -> System.out.println("not in Core Manufacture Department");
        }
    }
    case 03 -> {
        System.out.println("Shivam Singh ");
        switch(department){
            case "IT" -> System.out.println("not in IT Department");
            case "HR" -> System.out.println("not in HR Department");
            case "Management" -> System.out.println("Management Department");
            case "Core" -> System.out.println("Core Manufacture Department");
        }
    }
    case 04 -> {
        System.out.println("Biswas Mishra");
        switch(department){
            case "IT" -> System.out.println("IT Department");
            case "HR" -> System.out.println("not inHR Department");
            case "Management" -> System.out.println("not in Management Department");
            case "Core" -> System.out.println("Core Manufacture Department");
        }
    }
    case 05 -> {
        System.out.println("Rohan Biswal");
        switch(department){
            case "IT" -> System.out.println("not in IT Department");
            case "HR" -> System.out.println("HR Department");
            case "Management" -> System.out.println("not in Management Department");
            case "Core" -> System.out.println("not in Core Manufacture Department");
        }
    }
    case 06 -> {
        System.out.println("Debasish Jena");
        switch(department){
            case "IT" -> System.out.println("IT Department");
            case "HR" -> System.out.println("not inHR Department");
            case "Management" -> System.out.println("not in Management Department");
            case "Core" -> System.out.println("not in Core Manufacture Department");
        }
    }
    default -> System.out.println("enter a valid emID");

        }

    }
}
