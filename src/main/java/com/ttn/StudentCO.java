package com.ttn;
public class StudentCO {
    public String firstname;
    public String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "StudentCO{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
