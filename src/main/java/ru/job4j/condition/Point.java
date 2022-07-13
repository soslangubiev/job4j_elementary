package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(4, 12, 8, 24);
        double result3 = Point.distance(5, 7, 3, -2);
        System.out.println("distance from (0, 0) to (2, 0) = " + result1);
        System.out.println("distance from (4, 12) to (8, 24) = " + result2);
        System.out.println("distance from (5, 7) to (3, -2) = " + result3);
    }
}
