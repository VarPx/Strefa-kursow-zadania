public class Main {
    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(add(5F));
        System.out.println(add(10, 2));
    }

    public static float add(float a) {
        return --a;
    }

    public static int add(int a) {
        return ++a;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
