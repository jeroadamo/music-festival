package solvd.sqlmimic.entities;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Concerts")
public class Concert {

    private int idConcerts;

    private String time_Play;

    private String duration;

    private String date;

    private int area;

    private int idTickets;

    public Concert(int idConcerts, String time_play, String duration, String date, int area, int idTickets) {
        this.idConcerts = idConcerts;
        this.time_Play = time_play;
        this.duration = duration;
        this.date = date;
        this.area = area;
        this.idTickets = idTickets;
    }

    public int getIdConcerts() {
        return idConcerts;
    }
    @XmlAttribute(name = "idConcerts")
    public void setIdConcerts(int idConcerts) {
        this.idConcerts = idConcerts;
    }

    public int getIdTickets() {
        return idTickets;
    }

    public void setIdTickets(int idTickets) {
        this.idTickets = idTickets;
    }



    public String getTime_Play() {
        return time_Play;
    }

    public void setTime_Play(String time_Play) {
        this.time_Play = time_Play;
    }

    public String getDuration() {
        return duration;
    }
   @XmlElement(name = "duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }
   @XmlElement(name = "Date")
    public void setDate(String date) {
        this.date = date;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return idConcerts+ duration + date;
    }
}
