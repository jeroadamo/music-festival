package solvd.sqlmimic;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import solvd.sqlmimic.entities.Concert;

public class ConcertHandler extends DefaultHandler {
    private static final String CONCERTS = "Concerts";
    private static final String AREA = "area";
    private static final String DATE = "Date";
    private static final String DURATION = "duration";
    private static final String IDTICKETS = "idTickets";
    private Concert concert;
    private StringBuilder stringBuilder;
    @Override
    public void characters(char[] chars, int start, int length) throws SAXException {
        if (stringBuilder == null) {
            stringBuilder = new StringBuilder();
        } else {
            stringBuilder.append(chars, start, length);
        }
    }
    @Override
    public void startDocument() throws SAXException {
        concert = new Concert();
    }
    @Override
    public void startElement(String uri, String lName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case CONCERTS:
                stringBuilder = new StringBuilder();
                break;
            case AREA:
                stringBuilder = new StringBuilder();
                break;
            case DATE:
                stringBuilder = new StringBuilder();
                break;
            case DURATION:
                stringBuilder = new StringBuilder();
                break;
            case IDTICKETS:
                stringBuilder = new StringBuilder();
                break;
        }
    }
    @Override
    public void endElement(String uri, String lName, String qName) throws SAXException {
        switch (qName) {
            //case CONCERTS:
            //concert.setIdConcerts(Integer.parseInt(stringBuilder.toString()));
            case AREA:
                concert.setArea(Integer.parseInt(stringBuilder.toString()));
                break;
            case DATE:
                concert.setDate(stringBuilder.toString());
            case DURATION:
                concert.setDuration(stringBuilder.toString());
        }
    }
    public Concert getConcert() {
        return concert;
    }
}
