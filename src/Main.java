import entity.Cat;
import entity.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom",2,30.0,5.5);
        cat.run();
        cat.eat();
        cat.speak();
        cat.getInfo();

        System.out.println("--------------------------------------");

        Dog dog = new Dog("Bug",7,120.0,40);
        dog.run();
        dog.eat();
        dog.speak();
        dog.getInfo();

        System.out.println("--------------------------------------");

        System.out.println("Total: " + Cat.totalAnimal);
    }
}