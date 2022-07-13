package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double additionAndMultiply(double first, double second) {
        return addition(first, second)
                + multiply(first, second);
    }

    public static double additionAndDivision(double first, double second) {
        return addition(first, second)
                + division(first, second);
    }

    public static double sumOfBasicArithmeticOperations(double first, double second) {
        return addition(first, second) + multiply(first, second) + substraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Sum of addition and multiply : " + additionAndMultiply(10, 20));
        System.out.println("Sum of addition and division : " + additionAndDivision(10, 20));
        System.out.println("Sum of basic arithmetic operations : " + sumOfBasicArithmeticOperations(10, 20));
    }
}
