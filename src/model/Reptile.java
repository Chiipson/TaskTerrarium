package model;

public abstract class Reptile {
    private String name;
    private int age;
    private boolean itPoisonous;

    public Reptile(String name, int age, boolean itPoisonous) {
        this.name = name;
        this.age = age;
        this.itPoisonous = itPoisonous;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getItPoisonous() {
        return itPoisonous;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setItPoisonous(boolean itPoisonous) {
        this.itPoisonous = itPoisonous;
    }
}
