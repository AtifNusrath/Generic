package com.bridgelabz;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Max4Parameter {
    public static <T extends Comparable<T>> T max(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> void sortMethod(T... elements) {
        Arrays.sort(elements);
        System.out.println("\nThe sorted array is: ");
        for (T str : elements) {
            System.out.print(str + " ");
        }
    }

    public static void main(String args[]) {
        Integer[] numbers = {4, 2, 3, 5};
        System.out.println("\nMax no: " + max(numbers));
        sortMethod(numbers);

        Float[] fnumbers = {4.5f, 2.5f, 3.5f, 6.5f};
        System.out.println("\nMax no: " + max(fnumbers));
        sortMethod(fnumbers);

        String[] words2 = {"apple", "pear", "banana", "orange"};
        System.out.println("\nMax string: " + max(words2));
        sortMethod(words2);
    }
}
