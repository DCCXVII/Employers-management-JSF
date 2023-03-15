package com.example.Controllers;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Employer implements Serializable {
    private int id;
    private String email;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // email getter - setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // name getter - setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // password getter - setter
    public String getPassword() {
        return password;
    }



    
    public void setPassword(String password) {
        this.password = password;
    }

    // id getter - setter
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
}
