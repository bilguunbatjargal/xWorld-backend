package com.backend.xworld.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
public class User {


    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String role;

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
    public User(String firstName, String lastName, String email, String password) {
        this(email, firstName, lastName);
        this.password = password;
    }

    ///////////////////////////////
    ///////////////////////////////
    ////  Getter & Setter


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
