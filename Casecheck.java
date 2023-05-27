import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char ch =in.next().trim().charAt(0);

        if(ch >='a' && ch <= 'z') {
            System.out.println("First word is Lower Case Letter");
        }else {
            System.out.println("First word is Upper Case Letter");
        }
        System.out.println(ch);

    }
}
