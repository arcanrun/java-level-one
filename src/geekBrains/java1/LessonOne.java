package geekBrains.java1;

public class LessonOne {
    static int a = 1;
    static double b = 0.1;
    static String c = "HELLO";
    static char d = 'X';
    static boolean e = true;
    static float f = 0.2f;
    static byte g = 1;
    static long h = 2;
    static short i = 2;


    public static void main(String[] args) {
        System.out.println("CALC: ");
        System.out.println(LessonOne.calc(1, 2, 4, 5));
        System.out.println("-----------");
        System.out.println("COMPARE: ");
        System.out.println(LessonOne.compare(2, 3));
        System.out.println("-----------");
        LessonOne.plusOrMinus(a);
        System.out.println("-----------");
        System.out.println(LessonOne.isNegative(-1));
        System.out.println("-----------");
        LessonOne.greetings("Vasya");
    }

    public static int calc(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean compare(int a, int b) {
        int sum = a + b;

        return sum >= 10 & sum <= 20;

    }

    public static void plusOrMinus(int a) {
        if (a >= 0) {
            System.out.println("The number is positive");
            return;
        }
        System.out.println("The number is negative");

    }

    public static boolean isNegative(int a){
        return a < 0;
    }

    public  static void greetings(String name){
        System.out.println("Greetings, " + name + "!");
    }

}
