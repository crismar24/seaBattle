package ex0_stackoverflow;

public class Main {

    private static int i;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("testing..." + i++);
        test();
    }
}
