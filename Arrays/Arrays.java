import java.util.Scanner;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //syntax
         ArrayList<Integer> list = new ArrayList<>(5);
        list.add(53);
        list.add(53);
        list.add(133);
        list.add(1);
        list.add(533);
        list.add(34);
        list.add(24);
        list.add(52);
        list.add(73);
        list.add(643);
        list.add(87);
        list.add(35);
        list.set(2,34);
        list.remove(5);

        System.out.println(list.contains(73));

        System.out.println(list);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }
        System.out.println(list);
        System.out.println(list.contains(56));
    }
}
