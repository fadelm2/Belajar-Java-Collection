package programmer.zaman.now;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Fadel");
        collection.add("Udin");
        collection.add("Ibnu");
        collection.add("Jablehh");
        collection.add("Upay");
        collection.add("Eko");

        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Eko");
        collection.remove("Budi");
        collection.removeAll(List.of("Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Fadel")
        );

        System.out.println(
                collection.containsAll(List.of("Fadel", "Udin", "Ibnu", "Jablehh"))
        );

        System.out.println(collection.size());
    }
}
