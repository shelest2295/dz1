package yaroslav_shelest.lesson.dz1;

import java.util.Scanner;

public class Five {
    private static Scanner scanner = new Scanner(System.in); //Создаем объект класса Scanner
    // и связываем его с клавиатурой для ввода данных с клавиатуры
    public static void main(String[] args) {
        System.out.println("Задание 5"); // печатается номер задания в консоль
        System.out.println("Введите число"); // печатается информирующий текст в консоль
        int x = scanner.nextInt(); // сканирует следующий токен ввода как Int
        isPositiveOrNegative(x); // вызов метода напечатает результат в консоль
    }

    public static void isPositiveOrNegative(int x) { // метод ничего не возвращает
        if(x >= 0) {
            System.out.println(x + " положительное число"); // печатается результат работы метода
        } else {
            System.out.println(x + " отрицательное число"); // печатается результат работы метода
        }
    }
}
