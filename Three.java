package yaroslav_shelest.lesson.dz1;

public class Three {
    public static void main(String[] args) {
        System.out.println("Задание 3"); // печатается номер задания в консоль
        System.out.println(calculate(3, 5, 6, 5)); // печатается результат работы в консоль
    }

    public static float calculate(float a, float b, float c, float d) { // метод обязан вернуть число с плавающей запятой
        return a * (b + (c / d)); // метод возвращает результат без печати
    }
}
