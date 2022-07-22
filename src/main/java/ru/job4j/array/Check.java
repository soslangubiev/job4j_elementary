package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean benchmark = data[0];
        for (int index = 1; index < data.length; index++) {
            if (benchmark != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
