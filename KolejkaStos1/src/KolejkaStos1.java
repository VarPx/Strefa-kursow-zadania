import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KolejkaStos1 {
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

        System.out.println("\nArrayList sortowana: ");
        Collections.sort(arr);

        for (String o : arr) {
            System.out.println(o);
        }

        System.out.println();
        System.out.println(Collections.min(arr));

        System.out.println();
        System.out.println(Collections.max(arr));

        System.out.println();
        Collections.reverse(arr);
        for (String o : arr) {
            System.out.println(o);
        }

        System.out.println();
        Collections.shuffle(arr);
        for (String o : arr) {
            System.out.println(o);
        }
    }
}
