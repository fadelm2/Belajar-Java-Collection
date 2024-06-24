package programmer.zaman.now;

import programmer.zaman.now.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Fadel");

        person.addHobby("Sports");
        person.addHobby("Reading");

//        doSomething(person.getHobbies());
        for(String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

//    public static void doSomething(List<String> hobbies) {
//        hobbies.add("conding");
//    }
}
