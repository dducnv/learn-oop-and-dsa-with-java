package entity;

abstract class Animal {
    protected String name;
    protected int age;
    protected double height;
    protected double weight;

    public static int totalAnimal;

    public Animal() {
    }

    public Animal(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        totalAnimal++;
    }

    abstract void run();
    abstract void run(String runType);
    abstract void eat();
    abstract void eat(String foodName);
    abstract void  speak();
    abstract void  speak(String speakType);

    public void getInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height);
        System.out.println("Weight: "+ weight);
    }

}
