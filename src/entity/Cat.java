package entity;

public class Cat extends Animal{
    public Cat(String name, int age, double height,double weight) {
        super(name,age,height,weight);
    }

    @Override
    public void run() {
        System.out.println("walk like a "+ name);
    }

    @Override
    void run(String runType) {

    }

    @Override
    public void eat() {
        System.out.println("eat like a "+ name);
    }

    @Override
    void eat(String foodName) {

    }

    @Override
    public void speak() {
        System.out.println("Meowwwww");
    }

    @Override
    void speak(String speakType) {

    }
}
