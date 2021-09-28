package model;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;

public class MySaxParerHandler extends DefaultHandler {

    private ArrayList<Snake> snakeList = new ArrayList<Snake>();
    private ArrayList<Lizard> lizardList = new ArrayList<Lizard>();
    private ArrayList<Turtle> turtleList = new ArrayList<Turtle>();

    private String name;
    private int age;
    private boolean itPoisonous;

    private String currentTagName;

    private boolean isSnakes = false;
    private boolean isLizards = false;
    private boolean isTurtles = false;
    private boolean isElement = false;

    public ArrayList<Snake> getSnakeList() {
        return snakeList;
    }

    public ArrayList<Lizard> getLizardList() {
        return lizardList;
    }

    public ArrayList<Turtle> getTurtleList() {
        return turtleList;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTagName = qName;
        switch (currentTagName) {
            case "element":
                isElement = true;
                break;
            case "snakes":
                isSnakes = true;
                break;
            case "lizards":
                isLizards = true;
                break;
            case "turtles":
                isTurtles = true;
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName != null) {
            switch (qName) {
                case "element":
                    if (isSnakes) {
                        snakeList.add(new Snake(name, age, itPoisonous));
                    } else if (isLizards) {
                        lizardList.add(new Lizard(name, age, itPoisonous));
                    } else if (isTurtles)
                        turtleList.add(new Turtle(name, age, itPoisonous));
                    isElement = false;
                    break;
                case "snakes":
                    isSnakes = false;
                    break;
                case "lizards":
                    isLizards = false;
                    break;
                case "turtles":
                    isTurtles = false;
                    break;
            }
        }
        currentTagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(currentTagName == null){
            return;
        }
        if(isElement){
           if(isSnakes){
               this.getVulue(ch,start,length);
           }else if(isLizards){
               this.getVulue(ch,start,length);
           }else if(isTurtles){
               this.getVulue(ch,start,length);

           }
        }
    }

    private void getVulue(char[] ch, int start, int length){
        switch (currentTagName){
            case "name":
                name = new String(ch,start,length);
                break;
            case "age":
                age = Integer.parseInt(new String(ch,start,length));
                break;
            case "itPoisonous":
                switch (new String(ch,start,length)){
                    case "yes":
                        itPoisonous = true;
                        break;
                    case "no":
                        itPoisonous = false;
                        break;
                }
                break;
        }
    }
}

