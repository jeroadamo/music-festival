package solvd.sqlmimic.entities;

public class Ticket {
    private int idTickets;
    private String name_surname;
    private String email;
    private int national_id;

    public Ticket(int idTickets, String name_surname, String email, int national_id) {
        this.idTickets = idTickets;
        this.name_surname = name_surname;
        this.email = email;
        this.national_id = national_id;
    }

    public int getIdTickets() {
        return idTickets;
    }

    public void setIdTickets(int idTickets) {
        this.idTickets = idTickets;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNational_id() {
        return national_id;
    }

    public void setNational_id(int national_id) {
        this.national_id = national_id;
    }
}
