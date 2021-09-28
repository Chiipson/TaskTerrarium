package model;

import java.util.ArrayList;

public class Terrarium {
    private ArrayList<Snake> snakes;
    private ArrayList<Lizard> lizards;
    private ArrayList<Turtle> turtles;

    public Terrarium(ArrayList<Snake> snakes, ArrayList<Lizard> lizards, ArrayList<Turtle> turtles) {
        this.snakes = snakes;
        this.lizards = lizards;
        this.turtles = turtles;
    }

    public ArrayList<Snake> getSnakes() {
        return snakes;
    }

    public ArrayList<Lizard> getLizards() {
        return lizards;
    }

    public ArrayList<Turtle> getTurtles() {
        return turtles;
    }

    public void setSnakes(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    public void setLizards(ArrayList<Lizard> lizards) {
        this.lizards = lizards;
    }

    public void setTurtles(ArrayList<Turtle> turtles) {
        this.turtles = turtles;
    }
}
