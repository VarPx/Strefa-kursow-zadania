import java.util.HashMap;
import java.util.LinkedList;

public class MapSet {
    public static void main(String[] args) {
        //LinkedList czyli lista generyczna
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Poznan");
        lista.add("Wroclaw");
        lista.add("Zielona Wies");
        lista.remove(0);

        for (String l : lista) {
            System.out.println(l);
        }
        lista.clear();

        System.out.println("\nHashMap");
        //HashMap pierwszy element klucz a drugi element to klucz czyli String
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Poniedzialek");
        map.put(5, "Piatek");
        map.put(7, "Niedziela");

        System.out.println(map.get(5));

        System.out.println();
        //przy wyswieltaniu trzeba uzyc obiektu map i odwolac sie do values
        for (String m : map.values()) {
            System.out.println(m);
        }
    }
}
