package yaroslav_shelest.lesson.dz6;

public class Dog extends Animal{

    private String name;
    private double runDogMaxDistance = 500;
    private double swimDogMaxDistance = 10;
    private double jumpDogMaxDistance = 0.5;

    Dog(String name) {
        super.name = name;
        super.runMaxDistance = runDogMaxDistance;
        super.swimMaxDistance = swimDogMaxDistance;
        super.jumpMaxDistance = jumpDogMaxDistance;
    }

}
