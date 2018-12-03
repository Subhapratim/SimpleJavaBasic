package JAX_READ_WRITE.JAX_Writer.Writer;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class StaXWriter {

    private String configFile;

    public void setFile(String configFile) {
        this.configFile = configFile;
    }

    public void saveConfig() throws Exception {
        // create an XMLOutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();

        // create XMLEventWriter
        OutputStream outputStream = new FileOutputStream(configFile);
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(outputStream);

        // create an EventFactory
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();

        // create a Next Line
        XMLEvent end = eventFactory.createDTD("\n");

        // create and write Start Tag
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        eventWriter.add(end);
/*
        System.out.println(startDocument);
*/

        // create config open tag
        StartElement configStartElement = eventFactory.createStartElement("", "", "config");
        eventWriter.add(configStartElement);
        eventWriter.add(end);
/*
        System.out.println(configStartElement);
        System.out.println(end);
*/

        // Write the different nodes
        createNode(eventWriter, "mode", "1");
        createNode(eventWriter, "unit", "901");
        createNode(eventWriter, "current", "0");
        createNode(eventWriter, "interactive", "0");

        EndElement endElement = eventFactory.createEndElement("", "", "config");
        eventWriter.add(endElement);
        eventWriter.add(end);
/*
        System.out.println(endElement);
        System.out.println(end);
*/

        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {

        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");

        // create Start node
        StartElement startElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(startElement);

        // create Content
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);

        // create End node
        EndElement endElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(endElement);
        eventWriter.add(end);

    }

}
