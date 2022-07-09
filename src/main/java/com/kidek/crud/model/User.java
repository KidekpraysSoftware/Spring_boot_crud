package com.kidek.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "gender")
    private String gender;

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "mail")
    private String mail;


    public User() {
    }

    public User(String name, String lastName, String gender, String mail) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return  id + " - " + name + " " +  lastName  + ", " +  gender + ", " + mail ;
    }
}
