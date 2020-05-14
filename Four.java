package yaroslav_shelest.lesson.dz1;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("Задание 4"); // печатается номер задания в консоль
        Scanner scanner = new Scanner(System.in); //Создаем объект класса Scanner
        // и связываем его с клавиатурой для ввода данных с клавиатуры
        System.out.println("Введите первое число"); // печатается информирующий текст в консоль
        int a = scanner.nextInt(); // сканирует следующий токен ввода как Int
        System.out.println("Введите второе число"); // печатается информирующий текст в консоль
        int b = scanner.nextInt(); // сканирует следующий токен ввода как Int
        System.out.println(check(a, b)); // печатается результат работы в консоль
    }

    public static boolean check (int a, int b) { // метод проверяет правда или ложь, принимает на вход два целых числа
        return ( (a + b) >= 10 && (a + b) <= 20); // метод возвращает результат без печати
    }
}
