public class Main {
    public static void main(String[] args) {
        add(2, 5);
        add(1, 10);
        add(5, 7);

        int[] a = {10};
        change(a);
        System.out.println("a po wykonaniu change: " + a[0]);
    }

    //rezultat, typy proste po wyjściu z funkcji nie zapisują się, natomiast typy złożone zapisują swoją wartość

    //funkcja
    public static void change(int[] x) {
        x = new int[1];
        x[0] = 0;
        x[0]--;
        System.out.println("Zmienna x = " + x[0]);
    }

    //funkcja
    public static void add(int a, int b) {
        System.out.println("Wynik: " + (a + b));
    }
}
