package yaroslav_shelest.lesson.dz1;

import java.util.Scanner;

public class Six {
    public static void main(String[] args){
        System.out.println("Задание 6"); // печатается номер задания в консоль
        Scanner scanner = new Scanner(System.in); //Создаем объект класса Scanner
        // и связываем его с клавиатурой для ввода данных с клавиатуры
        System.out.println("Введите первое число"); // печатается информирующий текст в консоль
        int a = scanner.nextInt(); // сканирует следующий токен ввода как Int
        System.out.println(isNegative(a)); // печатается результат работы в консоль
    }

    public static boolean isNegative(int a) { // метод проверяет правда или ложь, принимает на вход два целых числа
        return a < 0; // метод возвращает результат без печати
    }

}
