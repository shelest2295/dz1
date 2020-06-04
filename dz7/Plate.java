package yaroslav_shelest.lesson.dz7;

import java.util.Scanner;

public class Plate {
    private int food;
    private int maxVolumePlate;
    public Plate(int food, int maxVolumePlate) {
        this.food = food;
        this.maxVolumePlate = maxVolumePlate;
    }

    public void decreaseFood(int n, String name) {
        String status = "false";
        if (food >= n) {
            food -= n;
            status = "true";
        }
        else {
            do {
                System.out.println("В миске недостаточно еды. Необходимо пополнить миску минимум на " + (n - food) + " из " + maxVolumePlate + ", чтобы накормить " + name);
                Scanner scanner = new Scanner(System.in);
                System.out.println("сытость: " + status);
                int eat = scanner.nextInt();
                add(eat);
                if ( food >= n){
                    food -= n;
                    status = "true";
                    break;
                }
            } while(true);
        }
        System.out.println("сытость: " + status);
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void add(int eat) {
        int volume = eat + food;
        if (volume < maxVolumePlate) {
            this.food = volume;
        }
        else {
            this.food = maxVolumePlate;
        }
    }

    public void balanceCat(){

    }
}
