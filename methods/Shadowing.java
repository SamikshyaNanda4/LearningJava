public class Shadowing {
    static int x=90; //sits on the throne

    public static void main(String[] args) {

        System.out.println(x); //90
        int x =40;//the class variable at line 2 is shadowedby it
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
