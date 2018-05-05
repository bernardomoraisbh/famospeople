package com.finepointmobile.famospeople;

public class User {

    public User(String firstName, String lastName, String emai) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emai = emai;
    }

    private int id;

    private String firstName;

    private String lastName;

    private String emai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }
}
