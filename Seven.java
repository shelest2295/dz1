package yaroslav_shelest.lesson.dz1;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Задание 7"); // печатается номер задания в консоль
        System.out.println("Введите имя"); // печатается информирующий текст в консоль
        Scanner scanner = new Scanner(System.in); //Создаем объект класса Scanner
        // и связываем его с клавиатурой для ввода данных с клавиатуры
        String name = scanner.nextLine(); // сканирует следующий токен
        greetings(name); // вызов метода напечатает результат в консоль
    }

    public static void greetings(String name) {  // метод ничего не возвращает
        System.out.println("Привет, " + name + "!"); // печатается результат работы метода
    }

}
