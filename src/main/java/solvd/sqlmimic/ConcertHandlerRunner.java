package solvd.sqlmimic;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import solvd.sqlmimic.ConcertHandler;
import solvd.sqlmimic.entities.Concert;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class ConcertHandlerRunner{
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        ConcertHandler concertHandler = new ConcertHandler();
        saxParser.parse("src/main/resources/marshalled.xml", concertHandler);
        Concert concert = concertHandler.getConcert();
        concert.getIdConcerts();
        concert.getDate();
        concert.getDuration();
        concert.getIdTickets();
        concert.getArea();
        System.out.println(concert);


    }
}
