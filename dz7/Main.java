package yaroslav_shelest.lesson.dz7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(23, 30);
        Cat[] cat = new Cat[6];
        cat[0] = new Cat("Barsik", 5);
        cat[1] = new Cat("Stepa", 7);
        cat[2] = new Cat("Kuzya", 4);
        cat[3] = new Cat("Baikal", 9);
        cat[4] = new Cat("Garfield", 6);
        cat[5] = new Cat("Darth Vader", 2);

        for (int i = 0; i < cat.length; i++) {
                cat[i].eat(plate);
        }
        plate.info();
    }
}
