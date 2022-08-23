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


    }
}
