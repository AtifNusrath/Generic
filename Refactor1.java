package com.bridgelabz;

public class Refactor1 {
    public static <T extends Comparable<T>> T max(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Integer[] numbers = {4, 2, 3};
        System.out.println("Max no: " + max(numbers));

        Float[] fnumbers = {4.5f, 2.5f, 3.5f};
        System.out.println("Max no: " + max(fnumbers));

        String[] words2 = {"apple", "pear", "banana"};
        System.out.println("Max string: " + max(words2));
    }
}
