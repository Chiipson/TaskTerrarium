package model;

public class Snake extends Scaly{

    public Snake(String name, int age, boolean itPoisonous) {
        super(name, age, itPoisonous);
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", itPoisonous=" + getItPoisonous() +
                '}';
    }
}
