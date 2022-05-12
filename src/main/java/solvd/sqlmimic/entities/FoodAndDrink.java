package solvd.sqlmimic.entities;

public class FoodAndDrink {
    private int idFood_Drinks_Stand;
    private int amount_of;
    private Area area;

    public FoodAndDrink(int idFood_drinks_stand, int amount_of, Area area) {
        idFood_Drinks_Stand = idFood_drinks_stand;
        this.amount_of = amount_of;
        this.area = area;
    }

    public int getIdFood_Drinks_Stand() {
        return idFood_Drinks_Stand;
    }

    public void setIdFood_Drinks_Stand(int idFood_Drinks_Stand) {
        this.idFood_Drinks_Stand = idFood_Drinks_Stand;
    }

    public int getAmount_of() {
        return amount_of;
    }

    public void setAmount_of(int amount_of) {
        this.amount_of = amount_of;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
