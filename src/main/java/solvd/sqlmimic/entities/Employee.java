package solvd.sqlmimic.entities;

public class Employee {
    private int idEmployee;
    private String name;
    private int idFoodDrinksStand;
    private int idSecurity;
    private int idElectricService;
    public Employee(int idEmployee, String name, int idFood_drinks_stand, int idSecurity, int idElectric_service) {
        this.idEmployee = idEmployee;
        this.name = name;
        idFoodDrinksStand = idFood_drinks_stand;
        this.idSecurity = idSecurity;
        idElectricService = idElectric_service;
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
    public int getIdFoodDrinksStand() {
        return idFoodDrinksStand;
    }
    public void setIdFoodDrinksStand(int idFoodDrinksStand) {
        this.idFoodDrinksStand = idFoodDrinksStand;
    }
    public int getIdSecurity() {
        return idSecurity;
    }
    public void setIdSecurity(int idSecurity) {
        this.idSecurity = idSecurity;
    }
    public int getIdElectricService() {
        return idElectricService;
    }
    public void setIdElectricService(int idElectricService) {
        this.idElectricService = idElectricService;
    }
}
