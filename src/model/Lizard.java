package model;

public class Lizard extends Scaly{
    public Lizard(String name, int age, boolean itPoisonous) {
        super(name, age, itPoisonous);
    }

    @Override
    public String toString() {
        return "Lizard{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", itPoisonous=" + getItPoisonous() +
                '}';
    }
}
