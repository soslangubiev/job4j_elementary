package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String answer = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            answer = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            answer = "До скорой встречи.";
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = DummyBot.answer("Привет, Бот.");
        System.out.println(result);
        result = DummyBot.answer("Пока.");
        System.out.println(result);
        result = DummyBot.answer("Сколько будет 2 + 2?");
        System.out.println(result);
    }
}
