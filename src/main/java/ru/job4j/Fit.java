package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Ideal weight for a man with a height of " + height + " is: " + man);
        System.out.println("Ideal weight for a woman with a height of " + height + " is: " + woman);
    }
}
