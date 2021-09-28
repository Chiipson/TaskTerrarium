package model;

public class Information {

    private String name;
    private int count;
    private double averageAge;

    public Information(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getAverageAge() {
        return averageAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setAverageAge(double averageAge) {
        this.averageAge = averageAge;
    }
}
