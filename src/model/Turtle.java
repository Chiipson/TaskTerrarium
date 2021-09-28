package model;

public class Turtle extends Reptile{

    public Turtle(String name, int age, boolean itPoisonous) {
        super(name, age, itPoisonous);
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", itPoisonous=" + getItPoisonous() +
                '}';
    }
}
