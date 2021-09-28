package com.bridgelabz;

public class FindFloatMax {
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

        System.out.println("Max no. at position 1st: " + max(4.6, 2.5, 3.5));

        System.out.println("Max no. at position 2nd: " + max(4.6, 6.5, 3.5));

        System.out.println("Max no. at position 3rd: " + max(4.6, 2.5, 8.5));

    }
}
