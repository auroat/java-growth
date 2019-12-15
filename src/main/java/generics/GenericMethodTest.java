package generics;

import java.util.Arrays;
import java.util.Collection;

public class GenericMethodTest {
    // generic method printArray
    public static <E, R, T> Collection<R> printArray(E[] inputArray, T[] anotherArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        Collection<R> result = (Collection<R>) Arrays.asList(anotherArray);

        return result;
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        printArray(intArray, intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray, intArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray, intArray);   // pass a Character array
    }
}
