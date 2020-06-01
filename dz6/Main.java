package yaroslav_shelest.lesson.dz6;

public class Main {

    public static void main(String[] args)
    {
        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Sharik");

        cat.run(150, 200);   // записываем расстояние, которое преодалело животное, и если хотим, то через запятую вторым числом меняем максимальное расстояние, которое может преодалеть животное
        dog.run(800, 700);
        cat.swim(5, 10);
        dog.swim(9);
        cat.jump(1.2);
        dog.jump(0.2);
    }
}
