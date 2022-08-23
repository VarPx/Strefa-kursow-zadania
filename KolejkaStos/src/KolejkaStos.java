import java.util.ArrayList;

public class KolejkaStos {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Zielona Wies");
        arr.add("Poznan");
        arr.add("Wroclaw");
        arr.add("Warszawa");

        System.out.println();

        for (String o : arr) {
            System.out.println(o);
        }
    }
}
