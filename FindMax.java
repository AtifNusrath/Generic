package com.bridgelabz;

public class FindMax {
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
            Integer[] numbers = {4, 2, 3}; //Creates array of integers
            System.out.println("Max no. at position 1st: " +max(numbers));

            Integer[] numbers2 = {4, 6, 3}; //Creates array of integers
            System.out.println("Max no. at position 2nd: " +max(numbers2));

            Integer[] numbers3 = {4, 2, 8}; //Creates array of integers
            System.out.println("Max no. at position 3rd: " +max(numbers3));

        }
}

