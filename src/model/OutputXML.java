package model;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileOutputStream;

public class OutputXML {

    public static void output(Information[] inf){
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        File file = new File("newData.xml");
        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream(file));

            writer.writeStartDocument();
            writer.writeCharacters("\n");
            writer.writeStartElement("Terrarium");

            for(Information i:inf) {
                writer.writeCharacters("\n\t");
                writer.writeStartElement(i.getName());
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("count");
                writer.writeCharacters(Integer.toString(i.getCount()));
                writer.writeEndElement();
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("averageAge");
                writer.writeCharacters(Double.toString(i.getAverageAge()));
                writer.writeEndElement();
                writer.writeCharacters("\n\t");
                writer.writeEndElement();
            }

            writer.writeCharacters("\n");
            writer.writeEndElement();
            writer.writeEndDocument();
        } catch (Exception e) {
            System.err.println("Unable to write the file: " + e.getMessage());
        }

    }
}
