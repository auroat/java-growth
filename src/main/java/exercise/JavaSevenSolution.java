package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSevenSolution {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Aurel", "Pintea", 45),
                new Person("Dorina", "Timbur", 30),
                new Person("Lidia", "Starodub", 80),
                new Person("Tom", "Mobyr", 30)
        );

        // Step 1: sort by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getLastName().compareTo(t1.getLastName());
            }
        });

        // Step 2: print all elements
        printAll(people);

        // Step 3: print all people that have the last name starting with S
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p, String startsWithString) {
                return p.getLastName().toLowerCase().startsWith(startsWithString);
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p, "s")) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
        System.out.println();
    }
}

interface Condition {
    boolean test(Person p, String startsWithString);
}