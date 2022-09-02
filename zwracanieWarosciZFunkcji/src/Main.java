public class Main {
    public static void main(String[] args) {
        int sum = add(2, 5);
        System.out.println("Suma a + b = " + sum);
        System.out.println("Suma: " + add(10, 5));
    }

    //funkcja/metoda jesli nie jest typem void ktory nic nie zwraca to trzeba dodac slowko "return"
    public static int add(int a, int b) {
        return a + b;
    }
}
