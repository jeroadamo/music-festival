package solvd.sqlmimic.entities;

public class Area {
    private int idArea;
    private String cardinal_location;

    public Area(int idArea, String cardinal_location) {
        this.idArea = idArea;
        this.cardinal_location = cardinal_location;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getCardinal_location() {
        return cardinal_location;
    }

    public void setCardinal_location(String cardinal_location) {
        this.cardinal_location = cardinal_location;
    }
}
