package generics;

import java.util.ArrayList;
import java.util.Objects;

public class GenericAlgorithms {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <E> int linearSearch(E[] array, E key) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], key)) {
                return i;
            }
        }
        return -1;
    }

    public static <E extends Comparable<E>> E max(E[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст.");
        }
        E result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) > 0) {
                result = array[i];
            }
        }
        return result;
    }

    public static <E extends Comparable<E>> E max(E[][] array) {
        E result = null;
        for (E[] row : array) {
            for (E element : row) {
                if (result == null || element.compareTo(result) > 0) {
                    result = element;
                }
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("Массив пуст.");
        }
        return result;
    }
}
