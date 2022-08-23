import java.util.ArrayList;

public class Kolekcja {
    public static void main(String[] args) {
        Animal kot1 = new Animal("Rudy");
        Animal kot2 = new Animal("Bury");
        Animal kot3 = new Animal("Bialy");

        //tworzenie listy ArrayList nie generycznej
        ArrayList arr = new ArrayList();
        arr.add(kot1);
        arr.add(kot2);
        arr.add(kot3);

        //wyswietlenie ArrayList
        System.out.println("--------------");
        for (Object o : arr) {
            System.out.println(((Animal)o).name);
        }
        System.out.println("--------------");

    }
}
