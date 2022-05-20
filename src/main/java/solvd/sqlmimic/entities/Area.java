package solvd.sqlmimic.entities;

public class Area {
    private int idArea;
    private String cardinalLocation;

    public Area(int idArea, String cardinalLocation) {
        this.idArea = idArea;
        this.cardinalLocation = cardinalLocation;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getCardinalLocation() {
        return cardinalLocation;
    }

    public void setCardinalLocation(String cardinalLocation) {
        this.cardinalLocation = cardinalLocation;
    }
}
