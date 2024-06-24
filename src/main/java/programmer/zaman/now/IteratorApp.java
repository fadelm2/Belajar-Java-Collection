package programmer.zaman.now;

import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Fadel", "Udin", "Ibnu", "Jablehh", "Upay", "Salbutt");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
