package yaroslav_shelest.lesson.dz6;

public class Animal {

    protected String name;
    protected double runMaxDistance;
    protected double swimMaxDistance;
    protected double jumpMaxDistance;

    void run(double runDistance) {
        if (runDistance < runMaxDistance) {
            System.out.println("run: " + (runDistance < runMaxDistance));
            System.out.println(name + " пробежал " + runDistance + " м. Максимальное расстояние, которое он может приодалеть составляет " + runMaxDistance + " м.");
        }
        else {
            System.out.println("run: " + (runDistance < runMaxDistance));
            System.out.println(name + " не может пробежать " + runDistance + " м, так как максимальное расстояние, которое он может приодалеть составляет " + runMaxDistance + " м.");
        }
    }

    void run(double runDistance, double runMaxDistance) {
        if (runDistance < runMaxDistance) {
            System.out.println("run: " + (runDistance < runMaxDistance));
            System.out.println(name + " пробежал " + runDistance + " м. Максимальное расстояние, которое он может приодалеть составляет " + runMaxDistance + " м.");
        }
        else {
            System.out.println("run: " + (runDistance < runMaxDistance));
            System.out.println(name + " не может пробежать " + runDistance + " м, так как максимальное расстояние, которое он может приодалеть составляет " + runMaxDistance + " м.");
        }
    }

    void swim(double swimDistance) {
        if (swimDistance < swimMaxDistance) {
            System.out.println("swim: " + (swimDistance < swimMaxDistance));
            System.out.println(name + " пробежал " + swimDistance + " м. Максимальное расстояние, которое он может приодалеть составляет " + swimMaxDistance + " м.");
        }
        else {
            System.out.println("swim: " + (swimDistance < swimMaxDistance));
            System.out.println(name + " не может пробежать " + swimDistance + " м, так как максимальное расстояние, которое он может приодалеть составляет " + swimMaxDistance + " м.");
        }
    }

    void swim(double swimDistance, double swimMaxDistance) {
        if (swimDistance < swimMaxDistance) {
            System.out.println("swim: " + (swimDistance < swimMaxDistance));
            System.out.println(name + " пробежал " + swimDistance + " м. Максимальное расстояние, которое он может приодалеть составляет " + swimMaxDistance + " м.");
        }
        else {
            System.out.println("swim: " + (swimDistance < swimMaxDistance));
            System.out.println(name + " не может пробежать " + swimDistance + " м, так как максимальное расстояние, которое он может приодалеть составляет " + swimMaxDistance + " м.");
        }
    }

    void jump(double jumpDistance) {
        if (jumpDistance < jumpMaxDistance) {
            System.out.println("jump: " + (jumpDistance < jumpMaxDistance));
            System.out.println(name + " подпрыгнул на " + jumpDistance + " м. Максимальное высота, на которое он может прыгнуть составляет " + jumpMaxDistance + " м.");
        }
        else {
            System.out.println("jump: " + (jumpDistance < jumpMaxDistance));
            System.out.println(name + " не может подпрыгнуть " + jumpDistance + " м, так как максимальное высота, на которую он может прыгнуть составляет " + jumpMaxDistance + " м.");
        }
    }

    void jump(double jumpDistance, double jumpMaxDistance) {
        if (jumpDistance < jumpMaxDistance) {
            System.out.println("jump: " + (jumpDistance < jumpMaxDistance));
            System.out.println(name + " подпрыгнул на " + jumpDistance + " м. Максимальное высота, на которое он может прыгнуть составляет " + jumpMaxDistance + " м.");
        }
        else {
            System.out.println("jump: " + (jumpDistance < jumpMaxDistance));
            System.out.println(name + " не может подпрыгнуть " + jumpDistance + " м, так как максимальное высота, на которую он может прыгнуть составляет " + jumpMaxDistance + " м.");
        }
    }

}
