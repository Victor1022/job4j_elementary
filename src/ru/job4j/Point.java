package ru.job4j;

public class Point {

        public static double distance(int x1, int y1, int x2, int y2) {
           int result = (x1 - x2);
           int result1 = (y1 - y2);
           double result2 = Math.pow(result,2);
           double result3 = Math.pow(result1,2);
           double result4 = result2 + result3;
           double result5 = Math.sqrt(result4);


            return result5;
        }

        public static void main(String[] args) {
            double result = Point.distance(8, 3, 2, 6);


            System.out.println("result (8, 3) to (2, 6) " + result);
        }
}
