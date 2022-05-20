package solvd.sqlmimic.entities;

public class ElectricService {
    private int idElectric_Service;
    private Area area;
    private boolean worksOnAltitude;

    public ElectricService(int idElectric_service, Area area, boolean worksOnAltitude) {
        idElectric_Service = idElectric_service;
        this.area = area;
        this.worksOnAltitude = worksOnAltitude;
    }

    public int getIdElectric_Service() {
        return idElectric_Service;
    }

    public void setIdElectric_Service(int idElectric_Service) {
        this.idElectric_Service = idElectric_Service;
    }

    public boolean isWorksOnAltitude() {
        return worksOnAltitude;
    }

    public void setWorksOnAltitude(boolean worksOnAltitude) {
        this.worksOnAltitude = worksOnAltitude;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
