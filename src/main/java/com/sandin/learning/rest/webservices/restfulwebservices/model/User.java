package com.sandin.learning.rest.webservices.restfulwebservices.model;


public class User {
    private Integer id;
    private String name;
    private String birthDate;

    public Integer getId() {
        return id;
    }

    public User(Integer id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
