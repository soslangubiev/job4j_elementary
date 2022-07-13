package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollars + " dollars.");
        float rubleValue = 140;
        float expectedDollarRate = 2;
        float expectedEuroRate = 2.3333333f;
        float actualEuroRate = Converter.rubleToDollar(rubleValue);
        float actualDollarRate = Converter.rubleToEuro(rubleValue);
        boolean passedRubleToDollarTest = expectedDollarRate == actualDollarRate;
        boolean passedRubleToEuroTest = expectedEuroRate == actualEuroRate;
        System.out.println("140 rubles are 2.33 dollars. Test result : " + passedRubleToDollarTest);
        System.out.println("140 rubles are 2 euro. Test result : " + passedRubleToEuroTest);
    }
}
