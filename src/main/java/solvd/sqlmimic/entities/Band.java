package solvd.sqlmimic.entities;

public class Band {
    private int idBand;
    private int idConcerts;
    private String name;

    public Band(int idBand, int idConcerts, String name) {
        this.idBand = idBand;
        this.idConcerts = idConcerts;
        this.name = name;
    }

    public int getIdBand() {
        return idBand;
    }

    public void setIdBand(int idBand) {
        this.idBand = idBand;
    }

    public int getIdConcerts() {
        return idConcerts;
    }

    public void setIdConcerts(int idConcerts) {
        this.idConcerts = idConcerts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
