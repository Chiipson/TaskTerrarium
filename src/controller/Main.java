package controller;

import model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ParsingXML parser = new ParsingXML();
        Terrarium MyTerrarium = parser.parse();

        ArrayList<Reptile> allReptiles = new ArrayList<Reptile>();
        ArrayList<Reptile> poisonous = new ArrayList<Reptile>();
        ArrayList<Reptile> notPoisonous = new ArrayList<Reptile>();


        allReptiles.addAll(MyTerrarium.getSnakes());
        allReptiles.addAll(MyTerrarium.getLizards());
        allReptiles.addAll(MyTerrarium.getTurtles());

        for(Reptile i : allReptiles){
            if(i.getItPoisonous()){
                poisonous.add(i);
            }else{
                notPoisonous.add(i);
            }
        }

        Information[] inf = new Information[2];
        inf[0]= new Information("poisonous");
        inf[1]= new Information("notPoisonous");

        inf[0].setCount(poisonous.size());
        inf[1].setCount(notPoisonous.size());
        inf[0].setAverageAge(calculateAverage(poisonous));
        inf[1].setAverageAge(calculateAverage(notPoisonous));

        OutputXML.output(inf);

    }

    private static double calculateAverage(ArrayList<Reptile> reptileList){

        double sum = 0;
        for(Reptile j : reptileList){
            sum +=j.getAge();
        }

        return sum/reptileList.size();
    }
}
