package yaroslav_shelest.lesson.dz6;

public class Cat extends Animal{

    private String name;
    final double runCatMaxDistance = 200;
    final double jumpCatMaxDistance = 2;

    Cat(String name) {
        super.name = name;
        super.runMaxDistance = runCatMaxDistance;
        super.jumpMaxDistance = jumpCatMaxDistance;
        this.name = name;
    }

    @Override
    void swim(double swimDistance)
    {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    void swim(double swimDistance, double swimMaxDistance)
    {
        System.out.println(name + " не умеет плавать");
    }

}
