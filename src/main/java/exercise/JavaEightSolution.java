package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaEightSolution {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Aurel", "Pintea", 45),
                new Person("Dorina", "Timbur", 30),
                new Person("Lidia", "Starodub", 80),
                new Person("Tom", "Mobyr", 30)
        );

        // Step 1: sort by last name
        Collections.sort(people, (p1, p2) -> {
            return p1.getLastName().compareTo(p2.getLastName());
        });

        // ... would be same as
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        // Step 2: print all elements
        printConditionally(people, (p1, startsWithString) -> true);

        // Step 3: print all people that have the last name starting with S
        printConditionally(people, (p, startsWithString) -> {
            return p.getLastName().toLowerCase().startsWith(startsWithString);
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p, "s")) {
                System.out.println(p);
            }
        }
    }
}