package entity;

public class Dog extends Animal{
    public Dog(String name, int age, double height, double weight) {
        super(name, age, height, weight);
    }

    @Override
    public void run() {
        System.out.println("walk like a dog");
    }

    @Override
    void run(String runType) {

    }

    @Override
    public void eat() {
        System.out.println("eat like a dog");
    }

    @Override
    void eat(String foodName) {

    }

    @Override
    public void speak() {
        System.out.println("Gau gau");
    }

    @Override
    void speak(String speakType) {

    }
}
