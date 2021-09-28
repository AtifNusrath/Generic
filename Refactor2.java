package com.bridgelabz;

public class Refactor2<T extends Comparable<T>> {

        T x, y, z;

        public Refactor2(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public T maximum() {
            return Refactor2.maximum(x, y, z);
        }

        public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
            T max = x;

            if (y.compareTo(max) > 0) {
                max = y;
            }

            if (z.compareTo(max) > 0) {
                max = z;
            }
            printMax(x, y, z, max);
            return max;
        }
        public static String testMaximum(String x,String y,String z){
            String max = x;

            if (y.compareTo(max) > 0) {
                max = y;
            }

            if (z.compareTo(max) > 0) {
                max = z;
            }
            printMax(x, y, z, max);
            return max;
        }

        public static <T> void printMax(T x,T y, T z, T max){
            System.out.printf("Max of %s, %s and %s is %s \n ", x, y, z, max);
        }

        public static void main(String[] args) {
            Integer xint =3, yint = 4, zint = 5;
            Float xfloat = 3.5f, yfloat = 4.5f, zfloat = 5.5f;
            String xstr = "pear", ystr = "apple", zstr = "banana";

            Refactor2.testMaximum(xstr,ystr,zstr);
            new Refactor2(xint,yint,zint).maximum();
            new Refactor2(xfloat,yfloat,zfloat).maximum();
            new Refactor2(xstr,ystr,zstr).maximum();
        }
}
