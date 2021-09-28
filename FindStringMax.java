package com.bridgelabz;

public class FindStringMax {
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
        String[] words = {"pear", "apple", "banana"}; //Creates an array of strings
        System.out.println("Max string at position 1st: "+max(words));

        String[] words2 = {"apple","pear", "banana"}; //Creates an array of strings
        System.out.println("Max string at position 2nd: "+max(words2));

        String[] words3 = {"banana", "apple", "pear"}; //Creates an array of strings
        System.out.println("Max string at position 3rd: "+max(words3));

    }
}
