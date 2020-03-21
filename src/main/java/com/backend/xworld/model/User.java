package com.backend.xworld.model;


import com.google.firebase.database.annotations.NotNull;

import javax.persistence.*;

@Entity
public class User {

    @NotNull
    private String password;

    private String firstName;

    private String lastName;

    private String phone;

    @NotNull
    private String email;

    /**
     * Default constructor
     */
    public User() { }

    /**
     * Constructor
     * @param email
     * @param firstName
     * @param lastName
     */
    public User(String email, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Constructor
     * @param password
     * @param email
     * @param firstName
     * @param lastName
     */
    public User( String password, String email, String firstName, String lastName) {
        this(email, firstName, lastName);
        this.password = password;
    }

    ///////////////////////////////
    ///////////////////////////////
    ////  Getter & Setter


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + "*********" + '\'' +
                '}';
    }

}
