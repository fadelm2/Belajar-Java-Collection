package programmer.zaman.now;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Fadel");
        names.add("Udin");
        names.add("Ibnu");

        names.set(0, "Budi");

        names.remove(1);
        System.out.println(names.get(0));
        for (var value :names){
            System.out.println(value);
        }


    }
}
