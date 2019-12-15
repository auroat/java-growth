package generics.genericsAndLambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;

interface Predicate<T> {
    boolean test(T input);
}

public class GenericsAndLambdasTest {

    public static final List<Integer> MY_INTS = asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    public static void main(String[] args) {
        Collection<Integer> onlyOdds = FilterOperations.filter(n -> n % 2 != 0, MY_INTS);

        for (Integer integer : onlyOdds) {
            System.out.println(integer);
        }

//        List<? super Number> a = new ArrayList<Object>();
    }
}

class FilterOperations {
    public static <T extends Object> Collection<T> filter(Predicate<? super T> predicate,
                                           Collection<T> items) {
        Collection<T> result = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    /* --- The original tutorial method ---
    public static <T> Collection<T> filter(Predicate<T> predicate,
                                       Collection<T> items) {
        Collection<T> result = new ArrayList<T>();
        for(T item: items) {
            if(predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
     */
}