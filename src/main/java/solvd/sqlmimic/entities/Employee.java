package solvd.sqlmimic.entities;

public class Employee {
    private int idEmployee;
    private String name;
    private int idFood_Drinks_Stand;
    private int idSecurity;
    private int idElectric_Service;

    public Employee(int idEmployee, String name, int idFood_drinks_stand, int idSecurity, int idElectric_service) {
        this.idEmployee = idEmployee;
        this.name = name;
        idFood_Drinks_Stand = idFood_drinks_stand;
        this.idSecurity = idSecurity;
        idElectric_Service = idElectric_service;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdFood_Drinks_Stand() {
        return idFood_Drinks_Stand;
    }

    public void setIdFood_Drinks_Stand(int idFood_Drinks_Stand) {
        this.idFood_Drinks_Stand = idFood_Drinks_Stand;
    }

    public int getIdSecurity() {
        return idSecurity;
    }

    public void setIdSecurity(int idSecurity) {
        this.idSecurity = idSecurity;
    }

    public int getIdElectric_Service() {
        return idElectric_Service;
    }

    public void setIdElectric_Service(int idElectric_Service) {
        this.idElectric_Service = idElectric_Service;
    }
}
