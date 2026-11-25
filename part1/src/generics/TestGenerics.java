package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(3, 1, 3, 2, 1));
        System.out.println("Исходный список: " + numbers);
        System.out.println("Без дубликатов: "
                + GenericAlgorithms.removeDuplicates(numbers));

        String[] words = {"Java", "стек", "массив", "стек"};
        System.out.println("Позиция слова стек: "
                + GenericAlgorithms.linearSearch(words, "стек"));
        System.out.println("Позиция слова класс: "
                + GenericAlgorithms.linearSearch(words, "класс"));

        Circle[] circles = {new Circle(2), new Circle(5), new Circle(3)};
        System.out.println("Наибольший круг: " + GenericAlgorithms.max(circles));
        Integer[][] matrix = {{3, 8, 1}, {4, 2, 9}};
        System.out.println("Максимум двумерного массива: "
                + GenericAlgorithms.max(matrix));
    }
}
