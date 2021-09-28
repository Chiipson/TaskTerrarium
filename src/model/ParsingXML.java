package model;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class ParsingXML {

    public Terrarium parse(){

        SAXParserFactory factory = SAXParserFactory.newInstance();
        MySaxParerHandler handler = new MySaxParerHandler();

        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            e.printStackTrace();
        }

        File file = new File("data.xml");
        try {
            parser.parse(file,handler);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Terrarium(handler.getSnakeList(),handler.getLizardList(),
                            handler.getTurtleList());
    }
}
