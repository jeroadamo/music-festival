package solvd.sqlmimic.entities;

public class Sound_Engenieer {
    private int idSound_Engenieer;
    private String name;
    private Concert concert;

    public Sound_Engenieer(int idSound_engenieer, String name, Concert concert) {
        idSound_Engenieer = idSound_engenieer;
        this.name = name;
        this.concert = concert;
    }

    public int getIdSound_Engenieer() {
        return idSound_Engenieer;
    }

    public void setIdSound_Engenieer(int idSound_Engenieer) {
        this.idSound_Engenieer = idSound_Engenieer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Concert getConcert() {
        return concert;
    }

    public void setConcert(Concert concert) {
        this.concert = concert;
    }
}
